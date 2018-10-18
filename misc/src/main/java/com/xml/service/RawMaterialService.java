package com.xml.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xml.bean.RawMaterial;
import com.xml.dao.RawMaterialMapper;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RawMaterialService {

	@Autowired
	private RawMaterialMapper rawMaterialMapper;
	
	public List<RawMaterial> getRawMaterialInfo(HttpServletRequest request) {
//		log.info("请求参数"+jsonData);
//		JSONObject obj = JSON.parseObject(jsonData);
		String pageNow = request.getParameter("page");
		String pageSize = request.getParameter("rows");
		if(pageNow!=null && !"".equals(pageNow)) {
			
			PageHelper.startPage(Integer.parseInt(pageNow) , Integer.parseInt(pageSize));
		}
		List<RawMaterial> list = rawMaterialMapper.getRawMaterialInfo();
		PageInfo<RawMaterial> list1 = new PageInfo<>(list);
		list = list1.getList();
		log.info("返回"+list.get(0).getCreatTime());
		return list;
	}
	
	
	public int insertRawMaterialInfo(HttpServletRequest request) {
		String rawMaterialName = request.getParameter("rawMaterialName");
		String rawMaterialPrice = request.getParameter("rawMaterialPrice");
		String rawMaterialUnit = request.getParameter("rawMaterialUnit");
		Date date = new Date(); 
		int id = (int) (date.getTime()/1000);
		RawMaterial rawMaterial = new RawMaterial();
		rawMaterial.setId(id);
		rawMaterial.setName(rawMaterialName);
		rawMaterial.setPrice(new BigDecimal(rawMaterialPrice));
		rawMaterial.setUnit(rawMaterialUnit);
		rawMaterial.setCreatTime(date);
		return rawMaterialMapper.insertSelective(rawMaterial);
	}
	
	public RawMaterial getByPrimaryKey(int id) {
//		rawMaterialMapper.selectByPrimaryKey(id);
		return rawMaterialMapper.selectByPrimaryKey(id);
	}
}

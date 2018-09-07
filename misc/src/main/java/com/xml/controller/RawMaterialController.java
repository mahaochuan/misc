package com.xml.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xml.bean.RawMaterial;
import com.xml.service.RawMaterialService;
import com.xml.vo.MaterialVo;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("rawmaterial")
public class RawMaterialController {

	@Autowired
	private RawMaterialService rawMaterialService;
	
	
	@RequestMapping("getRawMaterialInfo")
	public List<RawMaterial> getRawMaterialInfo() {
		List<RawMaterial> list = rawMaterialService.getRawMaterialInfo();
		log.info("返回"+list);
		return list;
	}
	
	@RequestMapping("insertRawMaterialInfo")
	public int insertRawMaterialInfo(HttpServletRequest request) {
		log.info("请求参数"+request.getParameter("rawMaterialName"));
//		log.info("请求参数"+vo);
		String rawMaterialName = request.getParameter("rawMaterialName");
		RawMaterial rawMaterial = new RawMaterial();
		rawMaterial.setId(123);
		rawMaterial.setName(rawMaterialName);
//		int list = rawMaterialService.insertRawMaterialInfo(rawMaterial);
		int list = 1;
		log.info("返回"+list);
		return list;
	}
}

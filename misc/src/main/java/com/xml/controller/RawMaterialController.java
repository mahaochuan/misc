package com.xml.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xml.bean.RawMaterial;
import com.xml.service.RawMaterialService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("rawmaterial")
public class RawMaterialController {

	@Autowired
	private RawMaterialService rawMaterialService;
	
	
	@RequestMapping("getRawMaterialInfo")
	public List<RawMaterial> getRawMaterialInfo(HttpServletRequest request) {
		
		log.info("当前页"+request.getParameter("page"));
		List<RawMaterial> list = rawMaterialService.getRawMaterialInfo(request);
		return list;
	}
	
	@RequestMapping("insertRawMaterialInfo")
	public int insertRawMaterialInfo(@RequestBody String jsonData,HttpServletRequest request) {
		log.info("请求参数"+request.getParameter("rawMaterialName"));
		log.info("请求参数"+jsonData);
		int i = rawMaterialService.insertRawMaterialInfo(request);
		log.info("返回"+i);
		return i;
	}
}

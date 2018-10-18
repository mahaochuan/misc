package com.xml.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xml.bean.Unit;
import com.xml.service.UnitService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("unit")
@Slf4j
public class UnitController {

	@Autowired
	private UnitService unitService;
	
	@RequestMapping("getunitinfoList")
	public List<Unit> getUnitInfoList(){
		return unitService.getUnitInfoList();
	}
	
	@RequestMapping("insertunitInfo")
	public int insertUnitInfo(@RequestBody String jsonData,HttpServletRequest request) {
		log.info("请求参数"+request.getParameter("unitName"));
		log.info("请求参数"+jsonData);
		int i = unitService.insertUnitInfo(request);
		log.info("返回"+i);
		return i;
	}
}

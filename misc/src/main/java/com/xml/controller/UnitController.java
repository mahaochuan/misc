package com.xml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xml.bean.Unit;
import com.xml.service.UnitService;

@RestController
@RequestMapping("unit")
public class UnitController {

	@Autowired
	private UnitService unitService;
	
	@RequestMapping("getunitinfo")
	public List<Unit> getUnitInfo(){
		return unitService.getUnitInfo();
	}
}

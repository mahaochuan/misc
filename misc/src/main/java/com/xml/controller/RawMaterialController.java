package com.xml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<RawMaterial> getRawMaterialInfo() {
		List<RawMaterial> list = rawMaterialService.getRawMaterialInfo();
		log.info("返回"+list);
		return list;
	}
}

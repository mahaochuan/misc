package com.xml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xml.bean.PurchaseInfo;
import com.xml.service.PurchaseInfoService;

@RestController
@RequestMapping("purchase")
public class PurchaseInfoController {

	@Autowired
	private PurchaseInfoService purchaseInfoService;
	
	@RequestMapping("getpurchaseInfo")
	public List<PurchaseInfo> getpurchaseInfo() {
		return purchaseInfoService.getpurchaseInfo();
	}
	
}

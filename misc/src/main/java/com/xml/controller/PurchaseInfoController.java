package com.xml.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xml.bean.PurchaseInfo;
import com.xml.service.PurchaseInfoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("purchase")
@Slf4j
public class PurchaseInfoController {

	@Autowired
	private PurchaseInfoService purchaseInfoService;
	
	@RequestMapping("getpurchaseInfo")
	public List<PurchaseInfo> getpurchaseInfo() {
		return purchaseInfoService.getpurchaseInfo();
	}
	
	@RequestMapping("insertPurchaseInfo")
	public int insertPurchaseInfo(@RequestBody String jsonData,HttpServletRequest request) {
		log.info("请求参数"+request.getParameter("rawMaterialName"));
		log.info("请求参数"+jsonData);
		int i = purchaseInfoService.insertPurchaseInfo(request);
		log.info("返回"+i);
		return i;
	}
}

package com.xml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.bean.PurchaseInfo;
import com.xml.dao.PurchaseRecordMapper;

@Service
public class PurchaseInfoService {

	@Autowired
	private PurchaseRecordMapper purchaseInfodao;
	
	public List<PurchaseInfo> getpurchaseInfo(){
//		purchaseInfodao.getpurchaseInfo();
		return purchaseInfodao.getpurchaseInfo();
	}
}

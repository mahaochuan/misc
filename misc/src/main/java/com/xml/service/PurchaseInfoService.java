package com.xml.service;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.bean.PurchaseInfo;
import com.xml.bean.PurchaseRecord;
import com.xml.dao.PurchaseRecordMapper;

@Service
public class PurchaseInfoService {

	@Autowired
	private PurchaseRecordMapper purchaseInfodao;
	
	public List<PurchaseInfo> getpurchaseInfo(){
//		purchaseInfodao.getpurchaseInfo();
		return purchaseInfodao.getpurchaseInfo();
	}
	
	public int insertPurchaseInfo(HttpServletRequest request) {
		Date date = new Date();
		int id = (int) (date.getTime()/1000);
		String materialId = request.getParameter("materialName");
		String purchaseNumber = request.getParameter("purchaseNumber");
		PurchaseRecord purchaseRecord = new PurchaseRecord();
		purchaseRecord.setId(id);
		purchaseRecord.setMaterialId(Integer.parseInt(materialId));
		purchaseRecord.setPurchaseNumber(Integer.parseInt(purchaseNumber));
		purchaseRecord.setCreatTime(date);
		purchaseRecord.setCreator("admin");
		return purchaseInfodao.insert(purchaseRecord);
	}
}

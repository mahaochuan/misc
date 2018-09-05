package com.xml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.bean.RawMaterial;
import com.xml.dao.RawMaterialMapper;

@Service
public class RawMaterialService {

	@Autowired
	private RawMaterialMapper rawMaterialMapper;
	
	public List<RawMaterial> getRawMaterialInfo() {
		return rawMaterialMapper.getRawMaterialInfo();
	}
	
	
	public int insertRawMaterialInfo(RawMaterial record) {
		return rawMaterialMapper.insertSelective(record);
	}
}

package com.xml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.bean.Unit;
import com.xml.dao.UnitMapper;

@Service
public class UnitService {

	@Autowired
	private UnitMapper dao;
	
	public List<Unit> getUnitInfo(){
		return dao.getUnitInfo();
	}
}

package com.xml.service;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.bean.Unit;
import com.xml.dao.UnitMapper;

@Service
public class UnitService {

	@Autowired
	private UnitMapper dao;
	
	public List<Unit> getUnitInfoList(){
		return dao.getUnitInfoList();
	}
	
	
	public int insertUnitInfo(HttpServletRequest request){
		String unitName = request.getParameter("unitName");
		Date date = new Date();
		int id =  (int) (date.getTime()/1000);
		Unit unit = new Unit();
		unit.setUnitId(id);
		unit.setUnitName(unitName);
		unit.setCreatTime(date);
		int i =dao.insert(unit);
		return i;
	}
}

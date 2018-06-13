package com.xml.dao;

import java.util.List;

import com.xml.bean.Unit;

public interface UnitMapper {
    int deleteByPrimaryKey(Integer unitId);

    int insert(Unit record);

    int insertSelective(Unit record);

    Unit selectByPrimaryKey(Integer unitId);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
    
    List<Unit> getUnitInfo();
}
package com.xml.dao;

import java.util.List;

import com.xml.bean.RawMaterial;

public interface RawMaterialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RawMaterial record);

    int insertSelective(RawMaterial record);

    RawMaterial selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RawMaterial record);

    int updateByPrimaryKey(RawMaterial record);
    
    List<RawMaterial> getRawMaterialInfo();
}
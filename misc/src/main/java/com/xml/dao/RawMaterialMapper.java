package com.xml.dao;

import com.xml.bean.RawMaterial;

import java.util.List;

public interface RawMaterialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RawMaterial record);

    int insertSelective(RawMaterial record);

    RawMaterial selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RawMaterial record);

    int updateByPrimaryKey(RawMaterial record);

    List <RawMaterial> getRawMaterialInfo();
}
package com.xml.dao;

import com.xml.bean.RawMaterial;
import com.xml.vo.RawMaterialVo;

import java.util.List;

public interface RawMaterialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RawMaterial record);

    int insertSelective(RawMaterial record);

    RawMaterialVo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RawMaterial record);

    int updateByPrimaryKey(RawMaterial record);

    List <RawMaterial> getRawMaterialInfo();
}
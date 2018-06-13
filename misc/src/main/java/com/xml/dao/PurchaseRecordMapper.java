package com.xml.dao;

import java.util.List;

import com.xml.bean.PurchaseInfo;
import com.xml.bean.PurchaseRecord;

public interface PurchaseRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseRecord record);

    int insertSelective(PurchaseRecord record);

    PurchaseRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PurchaseRecord record);

    int updateByPrimaryKey(PurchaseRecord record);
    
    List<PurchaseInfo> getpurchaseInfo();
}
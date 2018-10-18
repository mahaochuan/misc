package com.xml.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class RawMaterialVo implements Serializable {
    private Integer id;

    private String name;

    private BigDecimal price;

    private String unitCode;
    
    private String unitName;

    private Integer status;

    private Date creatTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

}
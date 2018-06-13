package com.xml.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class PurchaseInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4118020766139199696L;
	
    private Integer id;

    private Integer materialId;
    
    private String materialName;
    
    private BigDecimal price;
    
    private String unit;

    private Integer purchaseNumber;

    private BigDecimal totlePrice;
    
    private Date creatTime;

    private String creator;

    private String remake;
}

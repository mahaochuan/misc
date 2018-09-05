package com.xml.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class MaterialVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String rawMaterialName;
	private String rawMaterialPrice;
	private String rawMaterialUnit;
	private String linkMan;
	private String linkPhone;
	private String createMan;
	private String createTime;
}

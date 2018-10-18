package com.xml.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class MaterialVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String rawMaterialName;//原料名称
	private String rawMaterialPrice;//原料代价
	private String rawMaterialUnitCode;
	private String rawMaterialUnit;//单位
	private String linkMan;//
	private String linkPhone;
	private String createMan;
	private String createTime;
}

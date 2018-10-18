package com.xml.vo;

import java.util.List;

import lombok.Data;

@Data
public class EasyUIPageVo<T> {
	private long total;
	private List<T> rows;

}

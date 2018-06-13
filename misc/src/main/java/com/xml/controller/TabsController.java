package com.xml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tabs")
public class TabsController {

	@RequestMapping("material")
	public String getMaterial() {
		return "page/material";
	}

	@RequestMapping("purchase")
	public String getPurchase() {
		return "page/purchase";
	}
}

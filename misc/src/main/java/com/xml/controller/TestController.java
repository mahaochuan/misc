package com.xml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.xml.bean.Member;
import com.xml.dao.MemberMapper;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
public class TestController {
	
	@Autowired
	MemberMapper memberMapper;

	@RequestMapping("/test")
	public String test() {
		return "layout/west"; 
	}
	
	@RequestMapping("/")
	public String index() {
		return "index"; 
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/login",method= RequestMethod.POST)
	public String login(String userName,String password,RedirectAttributes rAttributes) {
		if(userName.isEmpty() || password.isEmpty()) {
			log.info("用户或密码错误");
			rAttributes.addFlashAttribute("error", "用户名或密码错误！");
			return "redirect:/login";
		}
		
		log.info("登陆用户名"+userName);
		Member member = memberMapper.findByUserName(userName);
		
		if(member==null || !member.getStatus()) {
			log.info("用户不存在或已失效");
			rAttributes.addFlashAttribute("error", "用户不存在或已被禁用!");
			return "redirect:/login";
		}else if(member.getPassword().equals(password)) {
			
		}
		
		return "login";
	}
}

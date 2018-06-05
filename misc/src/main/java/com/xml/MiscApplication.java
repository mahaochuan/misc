package com.xml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages="com.xml.dao")
@SpringBootApplication
public class MiscApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiscApplication.class, args);
	}
}

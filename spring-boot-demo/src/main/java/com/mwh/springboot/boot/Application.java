package com.mwh.springboot.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;

@Controller
@EnableAutoConfiguration
@ImportResource("classpath*:spring/application.xml")
public class Application {
	private static Logger log = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("Start Server Successfully!");
	}
}

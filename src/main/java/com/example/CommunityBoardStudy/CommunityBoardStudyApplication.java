package com.example.CommunityBoardStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {MultipartAutoConfiguration.class})
@ComponentScan(basePackages = {"com.example.Controller"})
@ComponentScan(basePackages = {"com.example.Service"})
@ComponentScan(basePackages = {"com.example.Dto"})
public class CommunityBoardStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunityBoardStudyApplication.class, args);
	}

}

package com.naver.openapi.config;

import kr.blogspot.kwangsub.model.SampleBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.naver.openapi.service.NaverDIChecker;
import com.naver.openapi.service.NaverDICheckerImpl;

@Configuration
@ImportResource("classpath:/properties-config.xml")
public class BaseConfig {
	
	
	@Value("#{dataProps['sample.app']}") 
	private String appName;
	
	@Bean
	NaverDIChecker naverDiChacker() {
		NaverDIChecker naverDiChecker = new NaverDICheckerImpl();
		return naverDiChecker;
	}
	
}

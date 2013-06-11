package com.naver.openapi;

import kr.blogspot.kwangsub.model.SampleBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naver.openapi.service.NaverDICheckerImpl;

public class OpenApiDiCheckMain {
	
	private static final Log LOG = LogFactory.getLog(OpenApiDiCheckMain.class);
	
	public static void main(String args[]) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.naver.openapi.config");
		NaverDICheckerImpl bean = context.getBean("naverDiChacker", NaverDICheckerImpl.class);
		
		LOG.info(bean.getNaverIDs("kwangsub_kim"));
	}
}

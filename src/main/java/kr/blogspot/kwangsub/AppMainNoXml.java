package kr.blogspot.kwangsub;

import kr.blogspot.kwangsub.model.SampleBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMainNoXml {
	
	private static final Log LOG = LogFactory.getLog(AppMainNoXml.class);
	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("kr.blogspot.kwangsub.config");
		SampleBean bean = context.getBean("sample", SampleBean.class);
		bean.setName("kwang");
		
		LOG.info(bean.getName());
	}
}

package kr.blogspot.kwangsub;

import kr.blogspot.kwangsub.service.SampleService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AppMain {
	
	private static final Log LOG = LogFactory.getLog(AppMain.class);
	
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		
		SampleService bean = (SampleService)context.getBean("sampleService");
		LOG.info(bean.hello());
		
	}
}
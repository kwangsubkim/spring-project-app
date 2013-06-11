package kr.blogspot.kwangsub.config;

import kr.blogspot.kwangsub.model.SampleBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/properties-config.xml")
public class BaseConfig {
	
	
	@Value("#{dataProps['sample.app']}") 
	private String appName;
	
	@Bean
	public SampleBean sample() {
		SampleBean bean = new SampleBean();
		bean.setName(appName);
		return bean;
	}
}

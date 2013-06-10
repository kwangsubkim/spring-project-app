package kr.blogspot.kwangsub.config;

import kr.blogspot.kwangsub.model.SampleBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {
	@Bean
	public SampleBean sample() {
		return new SampleBean();
	}
}

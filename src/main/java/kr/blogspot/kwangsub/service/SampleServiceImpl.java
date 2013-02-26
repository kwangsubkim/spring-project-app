package kr.blogspot.kwangsub.service;

import kr.blogspot.kwangsub.model.SampleBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "sampleService")
public class SampleServiceImpl implements SampleService {
	private static final Log LOG = LogFactory.getLog(SampleServiceImpl.class);

	@Autowired(required=false)
	private SampleBean bean;
	
	@Value("#{dataProps['sample.app']}")
	String appName;
	
	@Override
	public String hello() {
		LOG.info("hello " + appName);
		LOG.info(bean);
		return "hello " + appName;
	}

}

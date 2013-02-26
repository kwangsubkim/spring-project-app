package kr.blogspot.kwangsub.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service(value = "sampleService")
public class SampleServiceImpl implements SampleService {
	private static final Log LOG = LogFactory.getLog(SampleServiceImpl.class);

	@Override
	public String hello() {
		LOG.info("hello");
		return "hello";
	}

}

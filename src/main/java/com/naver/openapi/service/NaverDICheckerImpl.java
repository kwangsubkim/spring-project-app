package com.naver.openapi.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.client.RestTemplate;

public class NaverDICheckerImpl implements NaverDIChecker {
	
	private static final Log LOG = LogFactory.getLog(NaverDICheckerImpl.class);

	@Override
	public List<String> getNaverIDs(String naverId) {
		RestTemplate restTemplate = new RestTemplate();
		URI uri;
		try {
			uri = new URI("http://api.nid.naver.com/nidapi/userinfo_api.nhn?code=AAC_userinfo_206&id=kwangsub_kim");
			String result = restTemplate.getForObject(uri, String.class);
			LOG.info(result);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}

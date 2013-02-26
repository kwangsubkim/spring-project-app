package kr.blogspot.kwangsub;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.*;

import kr.blogspot.kwangsub.model.SampleBean;
import kr.blogspot.kwangsub.service.SampleService;
import kr.blogspot.kwangsub.service.SampleServiceImpl;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class SampleServiceTest {
	@InjectMocks
	private SampleServiceImpl service = new SampleServiceImpl();

	@Mock
	private SampleBean bean;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() {

	}

	@Test
	public void test() {
		Mockito.when(service.hello()).thenReturn("hello");
	}
}

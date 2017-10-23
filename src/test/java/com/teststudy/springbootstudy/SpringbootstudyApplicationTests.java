package com.teststudy.springbootstudy;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SpringbootstudyApplicationTests {

	@Test
	public void restTemplateTest() {
		RestTemplate r = new RestTemplate();
		ResponseEntity resp = r.getForEntity("https://jsonplaceholder.typicode.com/posts", String.class);
		Assert.assertEquals(resp.getStatusCode(), HttpStatus.OK);
	}

}

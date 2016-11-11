package org.kontakte.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class PingControllerTest {

	private PingController controller;
	
	@Before
	public void before() {
		controller = new PingController();
	}
	
	@Test
	public void testPing() {
		assertEquals("pong!",controller.ping());
	}

}

package org.kontakte.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/ping")
public class PingController {

	@RequestMapping(method=RequestMethod.GET)
	public String ping() {
		return "pong!";
	}
	
}

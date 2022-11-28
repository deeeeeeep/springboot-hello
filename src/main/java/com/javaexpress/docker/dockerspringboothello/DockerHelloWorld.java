package com.javaexpress.docker.dockerspringboothello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/docker")
public class DockerHelloWorld {

	@GetMapping
	public String getName() {
		
		return "Pipeline has been setup successfully by 1914006, 1914007, 1914029, 1914037";
	}
}

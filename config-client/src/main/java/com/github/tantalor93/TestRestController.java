package com.github.tantalor93;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestRestController {

	@Value("${message:default}")
	private String message;

	@GetMapping(value = "/message", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getMessage() {
		return message;
	}

	@PostMapping(value = "/message", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String postMessage(@RequestBody String body) {
		return body;
	}
}

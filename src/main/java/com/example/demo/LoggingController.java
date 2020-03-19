package com.example.demo;

import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class LoggingController {

	private static final AtomicInteger counter = new AtomicInteger();

	@GetMapping("/")
	public String handleRequest(HttpServletRequest request, HttpSession session) {
		// All key-value pairs added to MDC will be accessible in logback.xml/log4j2.xml
		// Each thread will have its own map
		MDC.put("userName", "John Doe");

		log.info("Hello World! This is Request {}", counter.get());
		MDC.clear();

		return "Hello World! Request Counter: " + counter.getAndIncrement();
	}

	@GetMapping("/test")
	public String handleRequest2(HttpServletRequest request, HttpSession session) {

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return "Hello World! Request Counter: " + counter.getAndIncrement();
	}

}

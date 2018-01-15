package com.suke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZiplinServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZiplinServiceApplication.class,args);
	}
}

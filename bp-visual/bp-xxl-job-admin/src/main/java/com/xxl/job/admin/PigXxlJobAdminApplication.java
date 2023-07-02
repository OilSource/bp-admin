package com.xxl.job.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
bp4cloud */
@EnableDiscoveryClient
@SpringBootApplication
public class PigXxlJobAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(PigXxlJobAdminApplication.class, args);
	}

}
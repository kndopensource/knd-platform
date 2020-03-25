package com.kernel.gateway;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/** 
* @author kndopensource
*/
@EnableAdminServer
@EnableDiscoveryClient 
@SpringBootApplication  
public class MonitorApp {
	public static void main(String[] args) {
		SpringApplication.run(MonitorApp.class, args);
	}
}

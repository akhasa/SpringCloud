package com.ibm.spring.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Spring Cloud Config Server features:
 * HTTP, resource-based API for external configuration (name-value pairs, or equivalent YAML content)
 * Encrypt and decrypt property values (symmetric or asymmetric)
 * Embeddable easily in a Spring Boot application using @EnableConfigServer
 * @author sp10508
 *
 */


@SpringBootApplication
//@EnableAutoConfiguration
//to create a config server that can be communicated with
@EnableConfigServer
public class ApplicationConfigServer {

 public static void main(String[] args) {
	 SpringApplication.run(ApplicationConfigServer.class, args);
 }
 
// @RequestMapping("/")
//	String home() {
//		return "Hello World!";
//	}

}

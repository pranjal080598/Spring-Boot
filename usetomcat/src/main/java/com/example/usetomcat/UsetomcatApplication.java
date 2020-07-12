package com.example.usetomcat;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class UsetomcatApplication extends SpringBootServletInitializer {
   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application.sources(UsetomcatApplication.class);
   }

	public static void main(String[] args) {
		SpringApplication.run(UsetomcatApplication.class, args);
	}
	@RequestMapping(value = "/")
	public String hello() {
		 return "Hello World from Tomcat";
	}

}

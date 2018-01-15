package com.suke;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@RestController
public class ServiceHiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class,args);
	}
	
	private static final Logger log = Logger.getLogger(ServiceHiApplication.class.getName());
	@Autowired
	public RestTemplate  restTemplate;
	@Bean
	public	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	@RequestMapping(value="/hi")
	public String callHome() {
		log.log(Level.INFO,"calling trace service-hi ");
		return restTemplate.getForObject("http://localhost:8989/miya",String.class);
	}
	@RequestMapping(value="/info")
	public String info() {
		log.log(Level.INFO,"calling trace service-hi ");
		 return "i'm service-hi";
	}
	@Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }
}

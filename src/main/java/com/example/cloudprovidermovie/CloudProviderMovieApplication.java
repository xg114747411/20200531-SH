package com.example.cloudprovidermovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudProviderMovieApplication {
	
	//真是主方法
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderMovieApplication.class, args);
    }
}

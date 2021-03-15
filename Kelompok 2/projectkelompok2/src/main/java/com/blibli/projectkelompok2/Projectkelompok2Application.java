package com.blibli.projectkelompok2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class Projectkelompok2Application {

	@Autowired
	private RedisTemplate<Object,Object> redisTemplate;

	public static void main(String[] args) {
		SpringApplication.run(Projectkelompok2Application.class, args);
	}

}

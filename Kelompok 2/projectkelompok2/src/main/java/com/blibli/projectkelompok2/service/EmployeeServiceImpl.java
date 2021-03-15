package com.blibli.projectkelompok2.service;

import com.blibli.projectkelompok2.model.Employee;
import com.blibli.projectkelompok2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Mono<Employee> save(Employee student) {
        return employeeRepository.save();
    }

    @Override
    public Flux<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void keys() {
        Set<Object> keys = redisTemplate.keys("my-key-*");
        System.out.println(keys);
    }

    @Override
    public void setValue() {
        redisTemplate.opsForValue().set("my-key", "my-value");
    }

    @Override
    public void getValue() {
        redisTemplate.opsForValue().get("my-key");
    }

    @Override
    public void deleteKey() {
        redisTemplate.delete("my-key");
    }

    @Override
    public void setKeyTimeout() {
        redisTemplate.expire("my-key", 60, TimeUnit.SECONDS);
    }
}

package com.blibli.projectkelompok2.service;

import com.blibli.projectkelompok2.model.Employee;
import com.blibli.projectkelompok2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class EmployeeServiceImpl implements EmployeeService {

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
}

package com.blibli.projectkelompok2.service;

import com.blibli.projectkelompok2.model.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

    Mono<Employee> save(Employee student);

    Flux<Employee> findAll();
}

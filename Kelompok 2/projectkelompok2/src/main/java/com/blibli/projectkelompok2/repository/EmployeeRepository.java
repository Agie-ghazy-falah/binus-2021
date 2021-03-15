package com.blibli.projectkelompok2.repository;

import com.blibli.projectkelompok2.model.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeRepository {

    Mono<Employee> save(Employee employee);

    Flux<Employee> findAll();
}

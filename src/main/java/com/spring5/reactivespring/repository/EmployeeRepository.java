package com.spring5.reactivespring.repository;

import com.spring5.reactivespring.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee,String> {
}

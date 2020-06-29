package com.spring5.reactivespring.controller;

import com.spring5.reactivespring.model.Employee;
import com.spring5.reactivespring.repository.EmployeeRepository;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(value="/save")
    public Mono<Employee> saveEmp(@RequestBody Employee employee){
        System.out.println("Hiiiiiiiiiiiiiiii");
        Mono<Employee> e=employeeRepository.save(employee);
        return e;
    }


    @GetMapping(value="/getallemp")
    public Flux<Employee> getAllEmp(){
        return employeeRepository.findAll();
    }

    @DeleteMapping(value="/delete/{id}")
    public Mono<Void> deleteData(@PathVariable String id){
        Mono<Void> e=employeeRepository.deleteById(id);
        return e;
    }

    @GetMapping(value="/getemp/{id}")
    public Mono<Employee> findById(@PathVariable String id){
        return employeeRepository.findById(id);
    }
}

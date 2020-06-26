package com.madhu.github.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.madhu.github.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long>{

}

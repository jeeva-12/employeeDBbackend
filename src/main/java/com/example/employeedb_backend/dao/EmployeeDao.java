package com.example.employeedb_backend.dao;

import com.example.employeedb_backend.model.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employees,Integer> {
}

package com.spring.ERMProject.ERM;

import com.spring.ERMProject.ERM.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee emp);
    List<Employee> findAll();

    Employee findById(Integer id);

    String deleteById(Integer id);

}

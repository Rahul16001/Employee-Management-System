package com.spring.ERMProject.ERM.EmployeeDAO;

import com.spring.ERMProject.ERM.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.lang.NonNullApi;

import java.util.List;
import java.util.Optional;

public interface EmployeeDAO extends JpaRepository<Employee,Integer> {

    List<Employee> findAll();

    Employee save(Employee theEmployee);
    Optional<Employee> findById(Integer id);
    void deleteById(Integer id);
}

package com.spring.ERMProject.ERM;

import com.spring.ERMProject.ERM.EmployeeDAO.EmployeeDAO;
import com.spring.ERMProject.ERM.entity.Employee;
import jakarta.persistence.EntityManagerFactory;
import jakarta.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeDAO employeeDAO;
    @Autowired
    EmployeeServiceImpl(EmployeeDAO employeeDAO)
    {
        this.employeeDAO = employeeDAO;
    }


    @Override
    @Transactional
    public Employee save(Employee emp) {
        return employeeDAO.save(emp);
    }

    @Override
    public List<Employee> findAll()
    {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        Optional<Employee> emp = employeeDAO.findById(id);
        Employee theEmployee = null;
        if(emp.isPresent())
        {
            theEmployee = emp.get();
        }
        return theEmployee;
    }

    @Override
    @Transactional
    public String deleteById(Integer id)
    {
        employeeDAO.deleteById(id);

        return "Data deleted";
    }
}

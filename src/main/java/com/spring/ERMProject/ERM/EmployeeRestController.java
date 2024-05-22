package com.spring.ERMProject.ERM;

import com.spring.ERMProject.ERM.EmployeeDAO.EmployeeDAO;
import com.spring.ERMProject.ERM.entity.Employee;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller // Controlller to send html files and @restController to send json or xml file
@RequestMapping("/ERM")
public class EmployeeRestController {
    EmployeeService employeeService;

    @Autowired
    EmployeeRestController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }
    @GetMapping("/employees")
    public String getEmployeeData(Model model)
    {
        List<Employee> emp = employeeService.findAll();
        model.addAttribute("emp_data",emp);
        return "employee_details";
    }

//    @PostMapping("/employees")
//    public Employee putData(@RequestBody Employee theEmp)
//    {
//        return employeeService.save(theEmp);
//    }
@PostMapping("/employees/save")
    public String putData(@ModelAttribute("emp_data") Employee theEmp)
    {
        employeeService.save(theEmp);
        return "redirect:/ERM/employees";
    }

    @GetMapping("/employeeForm")
    public String putData(Model model)
    {
        Employee newEmp = new Employee();
        model.addAttribute("empData",newEmp);
        return "emp_form";
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable Integer employeeId)
    {
        return employeeService.findById(employeeId);
    }

}

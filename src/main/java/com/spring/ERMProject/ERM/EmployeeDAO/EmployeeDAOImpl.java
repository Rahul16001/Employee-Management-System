//package com.spring.ERMProject.ERM.EmployeeDAO;
//
//import com.spring.ERMProject.ERM.EmployeeDAO.EmployeeDAO;
//import com.spring.ERMProject.ERM.entity.Employee;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.TypedQuery;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository // making DAO implementation data access logic class
//public class EmployeeDAOImpl implements EmployeeDAO {
//    final private EntityManager entityManager;
//
//    @Autowired
//    EmployeeDAOImpl(EntityManager entityManager)
//    {
//        this.entityManager = entityManager;
//    }
//
//    @Override
//    public List<Employee> getAllEmployee() {
//        TypedQuery<Employee> query = entityManager.createQuery("FROM Employee",Employee.class);
//        return query.getResultList();
//    }
//
//    @Override
//    public Employee addData(Employee emp)
//    {
//       return entityManager.merge(emp);
//    }
//
//    @Override
//    public Employee getEmployee(Integer id) {
//        return entityManager.find(Employee.class,id);
//    }
//
//    @Override
//    public String delEmployee(Integer id)
//    {
//        Employee theEmp = entityManager.find(Employee.class,id);
//        entityManager.remove(theEmp);
//        return "row Deleted";
//    }
//}

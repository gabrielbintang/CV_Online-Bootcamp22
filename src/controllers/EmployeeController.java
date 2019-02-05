/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.EmployeeDAO;
import java.util.List;
import models.Employee;
import org.hibernate.SessionFactory;

/**
 *
 * @author Rayhan
 */
public class EmployeeController {

    EmployeeDAO employeeDAO;

    public EmployeeController() {
    }

    public EmployeeController(SessionFactory sessionFactory) {
        employeeDAO = new EmployeeDAO(sessionFactory);
    }

    public List<Employee> save(Employee a) {
        return employeeDAO.functions(a, 1);
    }

    public List<Employee> search(Employee a) {
        return employeeDAO.functions(a, 3);
    }

    public List<Employee> delete(Employee a) {
        return employeeDAO.functions(a, 2);
    }
}

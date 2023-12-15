package com.example.employee;

import java.util.*;
import com.example.employee.*;

public interface EmployeeRepository {
    ArrayList<Employee> getAllEmployees();

    Employee getEmployeeById(int employeeId);

    Employee addEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(int employeeId);

}
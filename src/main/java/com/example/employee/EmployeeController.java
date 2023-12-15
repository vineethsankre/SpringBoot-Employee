package com.example.employee;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.employee.*;

@RestController;
public class EmployeeController{
    EmployeeService employeeService = new EmployeeService();

    @GetMapping("/employees")
    public ArrayList<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

}

package com.example.exceptionhandling.repo;

import com.example.exceptionhandling.model.EmployeeVO;

import java.util.stream.Stream;

public class EmployeeDB {

    public static void addEmployee(EmployeeVO employee) {
        System.out.println("added employee: "+employee.getEmployeeId());
    }

    public static EmployeeVO getEmployeeById(int id) {
        if (id ==1 ) {
            return new EmployeeVO(1, "Suhas", "SP", "spsuhas5@gmail.com");
        }
        return null;
    }
}

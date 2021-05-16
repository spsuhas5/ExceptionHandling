package com.example.exceptionhandling.controller;

import com.example.exceptionhandling.exception.RecordNotFoundException;
import com.example.exceptionhandling.model.EmployeeVO;
import com.example.exceptionhandling.repo.EmployeeDB;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class EmployeeRESTController {

    @PostMapping(value = "/employees")
    public ResponseEntity<EmployeeVO> addEmployee (@Valid @RequestBody EmployeeVO employee)
    {
        EmployeeDB.addEmployee(employee);
        return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
    }

    @GetMapping(value = "/employees/{id}")
    public ResponseEntity<EmployeeVO> getEmployeeById (@PathVariable("id") int id) {
        EmployeeVO employee = EmployeeDB.getEmployeeById(id);

        if(employee == null) {
            throw new RecordNotFoundException("Invalid employee id : " + id);
//            throw new Exception("Invalid emp id : " + id);
        }
        return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
    }
}

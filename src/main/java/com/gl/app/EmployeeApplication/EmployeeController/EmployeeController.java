package com.gl.app.EmployeeApplication.EmployeeController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmployeeController {

    @GetMapping("/employees")
    public String getEmployee()
    {
        System.out.println("Hello world");
        return "Employee details";
    }

}


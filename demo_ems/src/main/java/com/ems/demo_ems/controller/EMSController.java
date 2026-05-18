package com.ems.demo_ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api/employees")
public class EMSController {
    @Autowired
    private EMSService emsService;

    @GetMapping
    public List<EMSEntity> getAll() {
        return emsService.getAllEmployees();
    }

    @PostMapping
    public EMSEntity create(@RequestBody EMSEntity employee) {
        return emsService.saveEmployee(employee);
    }

}

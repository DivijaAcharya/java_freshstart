package com.ems.demo_ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EMSService {
    @Autowired
    private EMSRepositoryInterface emsRepositoryInterface;

    public List<EMSEntity> getAllEmployees() {
        return emsRepositoryInterface.findAll();
    }

    public EMSEntity saveEmployee(EMSEntity employee) {
        return emsRepositoryInterface.save(employee);
    }
}

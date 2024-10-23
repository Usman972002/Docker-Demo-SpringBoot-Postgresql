package com.usman.dockerDemo.controller;

import com.usman.dockerDemo.model.Family;
import com.usman.dockerDemo.repo.FamilyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FamilyController {

    @Autowired
    private FamilyRepo repo;

    @GetMapping("/AllFamilyDetails")
    public List<Family> getFamilyList(){
        return repo.findAll();
    }

    @PostMapping("/addMember")
    public String addFamilyMember(@RequestBody Family family){
        repo.save(family);
        return "Family Member Added SuccessFully";
    }

}

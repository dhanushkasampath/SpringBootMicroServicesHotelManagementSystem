package com.hotel.staffmicroservice.controller;

import com.hotel.staffmicroservice.model.StaffMember;
import com.hotel.staffmicroservice.service.StaffMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaffMemberController {

    @Autowired
    private StaffMemberService staffMemberService;

    //localhost:1111/staff/create
    @RequestMapping(method = RequestMethod.POST, value = "/staff/create")
    public String addStaff(@RequestBody StaffMember staffMember){
        StaffMember p = staffMemberService.create(staffMember);
        return p.toString();
    }

    //localhost:1111/staff/getAll
    @RequestMapping(method = RequestMethod.GET, value = "/staff/getAll")
    public List<StaffMember> getAll(){
        return staffMemberService.getAll();
    }

}


package com.hotel.staffmicroservice.service;

import com.hotel.staffmicroservice.model.StaffMember;
import com.hotel.staffmicroservice.repository.StaffMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffMemberService {

    @Autowired
    private StaffMemberRepository staffMemberRepository;

    public StaffMember create(StaffMember staffMember){
        return staffMemberRepository.save(staffMember);
    }

    //Retrieve operation
    public List<StaffMember> getAll(){
        return staffMemberRepository.findAll();
    }
}

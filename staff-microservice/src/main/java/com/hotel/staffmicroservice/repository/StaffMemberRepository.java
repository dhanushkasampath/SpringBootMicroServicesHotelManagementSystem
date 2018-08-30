package com.hotel.staffmicroservice.repository;

import com.hotel.staffmicroservice.model.StaffMember;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffMemberRepository extends MongoRepository<StaffMember, String> {
}

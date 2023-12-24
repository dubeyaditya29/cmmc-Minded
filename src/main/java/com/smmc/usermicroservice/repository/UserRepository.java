package com.smmc.usermicroservice.repository;

import com.smmc.usermicroservice.entity.UserDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserDetails,Long> {}

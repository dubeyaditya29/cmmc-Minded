package com.smmc.usermicroservice.service;

import com.smmc.usermicroservice.dto.UserDetailsDTO;
import com.smmc.usermicroservice.entity.UserDetails;
import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import java.util.List;

public interface UserService {

    List<UserDetailsDTO> getByUid(ObjectId userId);
    HttpStatus createUser(UserDetails userDetails);
}

package com.smmc.usermicroservice.service.impl;

import com.smmc.usermicroservice.dto.UserDetailsDTO;
import com.smmc.usermicroservice.entity.UserDetails;
import com.smmc.usermicroservice.repository.UserRepository;
import com.smmc.usermicroservice.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<UserDetailsDTO> getByUid(ObjectId userId) {
        return userRepository.findAll().stream().map(this::convertUserEntityToDto).collect(Collectors.toList());
    }

    @Override
    public HttpStatus createUser(UserDetails userDetails) {
        userRepository.save(userDetails);
        return HttpStatus.CREATED;
    }

    private UserDetailsDTO convertUserEntityToDto(UserDetails userDetails){

        UserDetailsDTO userDetailsDTO = new UserDetailsDTO();

        userDetailsDTO.setUserID(userDetails.getUserID());
        userDetailsDTO.setRole(userDetails.getRole());
        userDetailsDTO.setEmail(userDetails.getEmail());
        userDetailsDTO.setStatus(userDetails.getStatus());
        userDetailsDTO.setName(userDetails.getName());
        userDetailsDTO.setPhone(userDetails.getPhone());
        userDetailsDTO.setServices(userDetails.getServices());
        userDetailsDTO.setLanguages(userDetails.getLanguages());
        userDetailsDTO.setLocations(userDetails.getLocations());
        userDetailsDTO.setCompanyName(userDetails.getCompanyName());
        userDetailsDTO.setInstralink(userDetails.getInstralink());
        userDetailsDTO.setWebsitelink(userDetails.getWebsitelink());
        userDetailsDTO.setAbout(userDetails.getAbout());
        userDetailsDTO.setProfile_pic_url(userDetails.getProfile_pic_url());
        userDetailsDTO.setPublic_name(userDetails.getPublic_name());
        userDetailsDTO.setAddress(userDetails.getAddress());

        return userDetailsDTO;
    }

}

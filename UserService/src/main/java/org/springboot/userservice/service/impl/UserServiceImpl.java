package org.springboot.userservice.service.impl;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springboot.userservice.dto.UserDTO;
import org.springboot.userservice.entity.UserEntity;
import org.springboot.userservice.repo.UserRepo;
import org.springboot.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo repo;
    @Autowired
    ModelMapper mapper;
    @Override
    public void addUser(UserDTO userDTO) {
        if (repo.existsById(userDTO.getUserId())){
            throw new RuntimeException("User ID: "+userDTO.getUserId()+" is AlreadyExist!");
        }else{
            repo.save(mapper.map(userDTO, UserEntity.class));
        }
    }

    @Override
    public void deleteUser(String userId) {
        if (!repo.existsById(userId)){
            throw new RuntimeException("User ID: "+userId+" is Not Exist! Please Check ID");
        }else{
            repo.delete(mapper.map(userId, UserEntity.class));
        }
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        if (!repo.existsById(userDTO.getUserId())){
            throw new RuntimeException("User ID: "+userDTO.getUserId()+" is Not Exist!");
        }else{
            repo.save(mapper.map(userDTO, UserEntity.class));
        }
    }

    @Override
    public ArrayList<UserDTO> getAllUsers() {
        List<UserEntity> list = repo.findAll();
        return mapper.map(list,new TypeToken<ArrayList<UserDTO>>(){}.getType());
    }
}

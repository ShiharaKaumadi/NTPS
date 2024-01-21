package org.springboot.userservice.service;


import org.springboot.userservice.dto.UserDTO;

import java.util.ArrayList;

public interface UserService {
    void addUser(UserDTO userDTO);
    void deleteUser(String userId);
    void updateUser(UserDTO userDTO);
    ArrayList<UserDTO> getAllUsers();

}

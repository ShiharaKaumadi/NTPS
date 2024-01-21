package org.springboot.userservice.api;


import org.springboot.userservice.dto.UserDTO;
import org.springboot.userservice.service.UserService;
import org.springboot.userservice.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;
    @GetMapping("/test")
    public String invokeTestMethod(){
        System.out.println("Invoke Test Method In User");
        return "Invoke Test Method In User";
    }
    @PostMapping
    public ResponseUtil saveUser(@RequestBody UserDTO userDTO ){
        service.addUser(userDTO);
        return new ResponseUtil("200","Successfully Added ","User:" +userDTO);
    }
    @DeleteMapping(params="userId")
    public ResponseUtil deleteUser(String userId){
        service.deleteUser(userId);
        return new ResponseUtil("200","Successfully Deleted ","User:" +userId);
    }
    @PutMapping
    public ResponseUtil updateUser(@RequestBody UserDTO userDTO ){
        service.updateUser(userDTO);
        return new ResponseUtil("200","Successfully Updated ","Updated User Details:" +userDTO);
    }
    @GetMapping
    public ResponseUtil getAllUserList(){
        ArrayList<UserDTO> list = service.getAllUsers();
        return new ResponseUtil("200","Successful ","All User Details:" +list);
    }
}

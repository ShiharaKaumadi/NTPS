package org.springboot.adminservice.api;

import org.springboot.adminservice.dto.AdminDTO;
import org.springboot.adminservice.service.AdminService;
import org.springboot.adminservice.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService service;

    @PostMapping
    public ResponseUtil saveAdmin(@RequestBody AdminDTO adminDTO){
        service.addAdmin(adminDTO);
        return new ResponseUtil("200","Successfully Added ","Admin:" +adminDTO);
    }
    @DeleteMapping(params="adminId")
    public ResponseUtil deleteAdmin(String adminId){
        service.deleteAdmin(adminId);
        return new ResponseUtil("200","Successfully Deleted ","Admin:" +adminId);
    }
    @PutMapping
    public ResponseUtil updateAdmin(@RequestBody AdminDTO adminDTO){
        service.updateAdmin(adminDTO);
        return new ResponseUtil("200","Successfully Updated ","Updated Admin Details:" +adminDTO);
    }
    @GetMapping
    public ResponseUtil getAllAdminList(){
        ArrayList<AdminDTO> allAdmins = service.getAllAdmins();
        return new ResponseUtil("200","Successful ","Admin List: "+allAdmins);
    }
}

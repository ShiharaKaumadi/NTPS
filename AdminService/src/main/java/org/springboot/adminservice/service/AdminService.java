package org.springboot.adminservice.service;


import org.springboot.adminservice.dto.AdminDTO;

import java.util.ArrayList;

public interface AdminService {
    void addAdmin(AdminDTO adminDTO);
    void deleteAdmin(String adminId);
    void updateAdmin(AdminDTO adminDTO);
    ArrayList<AdminDTO> getAllAdmins();
}

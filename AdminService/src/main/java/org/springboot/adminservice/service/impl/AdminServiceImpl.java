package org.springboot.adminservice.service.impl;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springboot.adminservice.dto.AdminDTO;
import org.springboot.adminservice.entity.AdminEntity;
import org.springboot.adminservice.repo.AdminRepo;
import org.springboot.adminservice.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional

public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepo adminRepo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public void addAdmin(AdminDTO adminDTO) {
        if (adminRepo.existsById(adminDTO.getAdminId())){
            throw new RuntimeException("Admin "+adminDTO.getAdminId()+" is Exist!!");
        }else{
            adminRepo.save(mapper.map(adminDTO, AdminEntity.class));
        }
    }

    @Override
    public void deleteAdmin(String adminId) {
        if(!adminRepo.existsById(adminId)){
            throw new RuntimeException("Admin ID: "+adminId+" is Not Exist!!");
        }else{
            adminRepo.deleteById(adminId);
        }
    }

    @Override
    public void updateAdmin(AdminDTO adminDTO) {
        if (!adminRepo.existsById(adminDTO.getAdminId())){
            throw new RuntimeException("Admin ID: "+adminDTO.getAdminId()+" is Not Exist!!");
        }else{
            adminRepo.save(mapper.map(adminDTO, AdminEntity.class));
        }
    }

    @Override
    public ArrayList<AdminDTO> getAllAdmins() {
        List<AdminEntity> list = adminRepo.findAll();
        return mapper.map(list,new TypeToken<ArrayList<AdminDTO>>(){}.getType());
    }
}

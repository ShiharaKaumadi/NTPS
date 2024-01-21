package org.springboot.adminservice.repo;


import org.springboot.adminservice.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<AdminEntity,String> {
}

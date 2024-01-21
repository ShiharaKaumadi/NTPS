package org.springboot.adminservice.entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class AdminEntity {
    private String adminId;
    private String username;
    private String password;
    private String role;
    public AdminEntity(String adminId){
        this.adminId  =  adminId;
    }
}

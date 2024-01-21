package org.springboot.adminservice.dto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class AdminDTO {
    private String adminId;
    private String username;
    private String password;
    private String role;
    public AdminDTO(String adminId){
        this.adminId  =  adminId;
    }
}

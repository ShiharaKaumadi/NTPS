package org.springboot.userservice.dto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {
    private String userId;
    private String username;
    private String password;
    private String nicOrPassport;
    private String address;
    /*private String profilePicture;*/
    private int age;
    private String gender;
    private String email;
    private String contactNo;
    private String remarks;

    public UserDTO(String userId){
        this.userId = userId;
    }
}

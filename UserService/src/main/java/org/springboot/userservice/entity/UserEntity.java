package org.springboot.userservice.entity;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class UserEntity {
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

    public UserEntity(String userId){
        this.userId = userId;
    }
}

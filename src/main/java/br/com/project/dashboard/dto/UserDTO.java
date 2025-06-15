package br.com.project.dashboard.dto;

import org.springframework.beans.BeanUtils;

import br.com.project.dashboard.entity.UserEntity;

public class UserDTO {
    
    private Long id;
    private String name;
    private String login;
    private String password;
    private String email;
    
    public UserDTO() { 
    
    }

    public UserDTO(UserEntity userEntity) { // Constructor to convert UserEntity to UserDTO
        BeanUtils.copyProperties(userEntity, this);
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}

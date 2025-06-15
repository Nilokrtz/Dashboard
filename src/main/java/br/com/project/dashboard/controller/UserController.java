package br.com.project.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.project.dashboard.dto.UserDTO;
import br.com.project.dashboard.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping(value = "/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.readUser();        
    }

    @PostMapping
    public void insertUser(@RequestBody UserDTO userDTO) { //@requestBody take the body of the request without him the request fail
        userService.createUser(userDTO);
    }

    @PutMapping
    public UserDTO updateUser(@RequestBody UserDTO userDTO) {
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") Long id) {  //Path variable take the id from the endpoint and put on parameter of method deleteUser()
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }
}

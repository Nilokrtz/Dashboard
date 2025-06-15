package br.com.project.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.project.dashboard.dto.UserDTO;
import br.com.project.dashboard.entity.UserEntity;
import br.com.project.dashboard.repository.UseRepository;

@Service
public class UserService {  //CRUD operations for UserEntity

    @Autowired
    private UseRepository userRepository;   

    public List<UserDTO> readUser() {
        List<UserEntity> users = userRepository.findAll();
        return users.stream().map(UserDTO::new).toList();
    }

    public void createUser(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity(userDTO);
        userRepository.save(userEntity);
    }

    public UserDTO updateUser(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity(userDTO);
        userRepository.save(userEntity);
        return new UserDTO(userEntity);
    }

    public void deleteUser(Long id) {
        UserEntity userEntity = userRepository.findById(id).get();
        userRepository.delete(userEntity);
    }

    public UserDTO searchById(Long id) {
        return new UserDTO(userRepository.findById(id).get());
    }
}

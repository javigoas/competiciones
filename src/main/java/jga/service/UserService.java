package jga.service;

import jga.entities.UserEntity;
import jga.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

//    private final UserRepository userRepository;
//
//    // Inyección de dependencias a través del constructor
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    // Método para obtener todos los usuarios (SELECT *)
//    public List<UserEntity> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    // Método para obtener un usuario por ID (SELECT ... WHERE id = ?)
//    public Optional<UserEntity> getUserById(Long id) {
//        return userRepository.findById(id);
//    }
//
//    // Método para obtener un usuario por email (usando el método personalizado del repositorio)
//    public List<UserEntity> getUserByDivision(Integer division) {
//        return userRepository.findByDivision(division);
//    }
//
//    // Método de ejemplo para crear un usuario (INSERT)
//    public UserEntity createUser(UserEntity user) {
//        return userRepository.save(user);
//    }

}

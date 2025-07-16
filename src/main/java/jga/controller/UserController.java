package jga.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jga.entities.UserEntity;
import jga.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@Tag(name = "CRUD user")
public class UserController {
//    private final UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @Operation(summary = "Get all users")
//    @ApiResponse(responseCode = "200", description = "Obtiene todos los usuarios")
//    @GetMapping // GET /api/users -> SELECT * FROM users
//    public List<UserEntity> getAllUsers() {
//        return userService.getAllUsers();
//    }
//
//    @Operation(summary = "Get one user")
//    @ApiResponse(responseCode = "200", description = "Get an especific user by Id")
//    @GetMapping("/{id}") // GET /api/users/1 -> SELECT * FROM users WHERE id = 1
//    public Optional<UserEntity> getUserById(@PathVariable Long id) {
//        return userService.getUserById(id);
//    }
//
//    @Operation(summary = "Get by division")
//    @ApiResponse(responseCode = "200", description = "Get all users by division")
//    @GetMapping("/division/{division}") // GET /api/users/division/2 -> SELECT * FROM users WHERE division = 2
//    public List<UserEntity> getUserByEmail(@PathVariable Integer division) {
//        return userService.getUserByDivision(division);
//    }
//
//    @Operation(summary = "Add User")
//    @ApiResponse(responseCode = "200", description = "Add new user")
//    @PostMapping // POST /api/users (con un User en el cuerpo de la petición) -> INSERT INTO users
//    public UserEntity createUser(@RequestBody UserEntity user) {
//        return userService.createUser(user);
//    }
}

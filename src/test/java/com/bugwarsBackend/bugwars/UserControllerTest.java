//package com.bugwarsBackend.bugwars;
//
//import com.bugwarsBackend.bugwars.controller.UserController;
//import com.bugwarsBackend.bugwars.model.User;
//import com.bugwarsBackend.bugwars.service.UserService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class UserControllerTest {
//
//    private UserService userService;
//    private UserController userController;
//
//    @BeforeEach
//    void setUp() {
//        userService = new UserService(); // Assuming you have a concrete implementation of UserService
//        userController = new UserController(userService); // Assuming UserController requires a UserService
//    }
//
//    @Test
//    void getAllUsers() {
//        User user1 = new User(1, "John Doe", "john@example.com");
//        User user2 = new User(2, "Jane Doe", "jane@example.com");
//        List<User> expectedUsers = Arrays.asList(user1, user2);
//
//        List<User> actualUsers = userController.getAllUsers();
//
//        assertEquals(expectedUsers, actualUsers);
//    }
//
//    @Test
//    void getUserById() {
//        User expectedUser = new User(1L, "John Doe", "john@example.com");
//
//        Optional<User> actualUser = userController.getUserById(1L);
//
//        assertEquals(expectedUser, actualUser);
//    }
//
//    @Test
//    void createUser() {
//        User newUser = new User(1L, "John Doe", "john@example.com");
//
//        User createdUser = userController.createUser(newUser);
//
//        assertEquals(newUser, createdUser);
//    }
//
//    @Test
//    void updateUser() {
//        User existingUser = new User(1L, "John Doe", "john@example.com");
//        User updatedUser = new User(1L, "Updated John Doe", "updatedjohn@example.com");
//
//        userController.createUser(existingUser); // Assuming user exists before updating
//
//        User actualUpdatedUser = userController.updateUser(1L, updatedUser);
//
//        assertEquals(updatedUser, actualUpdatedUser);
//    }
//
//    @Test
//    void deleteUser() {
//        // Assuming deleteUser() method is implemented in your UserService
//        userController.deleteUser(1L);
//
//        // You may want to add further assertions based on the behavior of your controller/service
//    }
//}

package Job.Portal.System.controller;

import Job.Portal.System.model.User;
import Job.Portal.System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    // Injecting UserService dependency
    @Autowired
    private UserService userService;

    /*
     * Register a new user
     * This method registers a new user in the system.
     */
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User registeredUser = userService.registerUser(user);  // Register the user
        return ResponseEntity.ok(registeredUser);  // Return the registered user
    }

    /*
     * Get user by username
     * This method retrieves a user based on the provided username.
     */
    @GetMapping("/username/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable String username) {
        User user = userService.findByUsername(username);  // Find the user by username
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();  // Return the user or 404 if not found
    }

    /*
     * Get user by email
     * This method retrieves a user based on the provided email.
     */
    @GetMapping("/email/{email}")
    public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
        User user = userService.findByEmail(email);  // Find the user by email
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();  // Return the user or 404 if not found
    }
}

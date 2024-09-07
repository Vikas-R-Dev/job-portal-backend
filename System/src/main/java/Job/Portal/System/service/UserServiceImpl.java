package Job.Portal.System.service;

import Job.Portal.System.model.User;
import Job.Portal.System.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service  // This class handles user-related business logic and interacts with the repository
public class UserServiceImpl implements UserService, UserDetailsService {

    // Injecting UserRepository dependency
    @Autowired
    private UserRepository userRepository;

    // Injecting PasswordEncoder dependency for encoding passwords
    @Autowired
    private PasswordEncoder passwordEncoder;

    /*
     * Register a new user
     * This method registers a new user in the system after checking for existing usernames and emails.
     * @param user The user to be registered
     * @return The registered user
     * @throws RuntimeException if the username or email already exists
     */
    @Override
    public User registerUser(User user) {
        // Check if username or email already exists
        if (userRepository.findByUsername(user.getUsername()) != null) {
            throw new RuntimeException("Username already exists");
        }
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new RuntimeException("Email already exists");
        }

        // Encode the password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Save the user and return the saved entity
        return userRepository.save(user);
    }

    /*
     * Load user by username
     * This method loads a user by their username for authentication purposes.
     * @param username The username of the user to load
     * @return The UserDetails object containing user information
     * @throws UsernameNotFoundException if the user is not found
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);  // Find the user by username
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        // Return a UserDetails object for Spring Security
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new ArrayList<>());
    }

    /*
     * Find user by ID
     * This method finds a user by their ID.
     * @param id The ID of the user to find
     * @return An Optional containing the found user or empty if not found
     */
    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    /*
     * Find user by username
     * This method finds a user by their username.
     * @param username The username of the user to find
     * @return The found user or null if not found
     */
    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    /*
     * Find user by email
     * This method finds a user by their email.
     * @param email The email of the user to find
     * @return The found user or null if not found
     */
    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}

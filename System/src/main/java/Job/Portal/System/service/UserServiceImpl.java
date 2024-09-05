package Job.Portal.System.service;

import Job.Portal.System.model.User;
import Job.Portal.System.repository.UserRepository;
import Job.Portal.System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    // Inject the UserRepository bean
    @Autowired
    private UserRepository userRepository;

    // Inject the PasswordEncoder bean for encoding passwords
    @Autowired
    private PasswordEncoder passwordEncoder;

    /*
     * Method to register a new user
     * This method encodes the user's password using the PasswordEncoder before saving the user to the repository.
     */
    @Override
    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));  // Encode and set the user's password.
        return userRepository.save(user);  // Save and return the new user.
    }

    /*
     * Method to find a user by their ID
     * This method retrieves a user from the repository using their ID.
     * It returns an Optional containing the user if found, or an empty Optional if not.
     */
    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);  // Find and return the user by ID, wrapped in an Optional.
    }

    /*
     * Method to find a user by their username
     * This method retrieves a user from the repository using their username.
     * It returns the User object if found.
     */
    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);  // Find and return the user by username.
    }

    /*
     * Method to find a user by their email
     * This method retrieves a user from the repository using their email.
     * It returns the User object if found.
     */
    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);  // Find and return the user by email.
    }
}

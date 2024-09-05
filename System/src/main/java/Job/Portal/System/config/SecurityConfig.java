package Job.Portal.System.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // Configure HTTP security

        /*
         * Enable CORS and disable CSRF protection
         * CSRF is disabled because we are using stateless sessions
         */
        http
                .cors().and()  // Enable CORS.
                .csrf(csrf -> csrf.disable())  // Disable CSRF.
                .authorizeHttpRequests(authz -> authz
                        // Permit all access to the user and employee registration endpoints
                        .requestMatchers("/api/users/register", "/api/employees/register").permitAll()
                        // Permit access to specific user and employee endpoints
                        .requestMatchers("/api/users/username/**", "/api/users/email/**").permitAll()
                        .requestMatchers("/api/employees/update", "/api/employees/user/**").permitAll()
                        // Permit access to job-related endpoints
                        .requestMatchers("/api/jobs/**").permitAll()
                        .requestMatchers("/api/job-applications/**").permitAll()
                        .requestMatchers("/api/job-categories/**").permitAll()
                        // All other requests require authentication
                        .anyRequest().authenticated()
                )
                // Use stateless session management (no session is stored on the server)
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                // Enable basic HTTP authentication
                .httpBasic(basic -> {});
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        // Bean for password encoding using BCrypt
        return new BCryptPasswordEncoder();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        // Configure CORS for the application
        CorsConfiguration configuration = new CorsConfiguration();

        // Allow the React app's origin
        configuration.setAllowedOrigins(Arrays.asList("http://localhost:3000"));

        // Allow standard HTTP methods
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));

        // Allow all headers
        configuration.setAllowedHeaders(Arrays.asList("*"));

        // Allow credentials (cookies, authorization headers, etc.)
        configuration.setAllowCredentials(true);

        // Apply the configuration to all endpoints
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);

        return source;
    }
}

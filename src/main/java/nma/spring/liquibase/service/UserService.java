package nma.spring.liquibase.service;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import nma.spring.liquibase.entities.User;
import nma.spring.liquibase.repository.UserRepository;

@Component
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}

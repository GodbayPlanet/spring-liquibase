package nma.spring.liquibase.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import nma.spring.liquibase.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findAll();
}

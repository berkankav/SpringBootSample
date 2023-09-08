package de.berkan.sample.repositories;

import de.berkan.sample.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Integer>  {

    Optional<User> findByEmailAndPassword(String email, String password);
    Optional<User> findBySecret(String secret);
}
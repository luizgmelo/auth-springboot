package br.com.luizgmelo.springsecurityjwt.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.luizgmelo.springsecurityjwt.models.User;

public interface UserRepository extends CrudRepository<User, String> {
  Optional<User> findByUsername(String username);
}

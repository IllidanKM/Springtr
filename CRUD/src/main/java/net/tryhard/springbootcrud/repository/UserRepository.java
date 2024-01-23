package net.tryhard.springbootcrud.repository;

import net.tryhard.springbootcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}

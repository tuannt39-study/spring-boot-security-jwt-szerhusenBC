package vn.its.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.its.model.security.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

package web.spring_boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import web.spring_boot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
  }

package com.app.sistemas_web.repository;

import com.app.sistemas_web.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

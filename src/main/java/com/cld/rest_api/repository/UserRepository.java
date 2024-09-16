package com.cld.rest_api.repository;

import com.cld.rest_api.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

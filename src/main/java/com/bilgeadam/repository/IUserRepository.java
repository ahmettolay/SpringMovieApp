package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}

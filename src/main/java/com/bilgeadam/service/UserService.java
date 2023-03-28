package com.bilgeadam.service;

import com.bilgeadam.repository.IUserRepository;
import com.bilgeadam.repository.entity.User;
import com.bilgeadam.utility.ICrudService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Builder
public class UserService implements ICrudService<User, Integer> {

    private final IUserRepository userRepository;

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public Iterable<User> saveAll(Iterable<User> t) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User delete(Integer integer) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Integer integer) {
        return Optional.empty();
    }

    public User register(String name, String surename, String email, String password, String repassword) {
        User user = User.builder()
                .name(name)
                .surename(surename)
                .email(email)
                .password(password)
                .repassword(repassword)
                .build();
        if (!password.equals(repassword) || password.isBlank() || repassword.isBlank()) {
            throw new RuntimeException("Şifreler aynı değildir.");

        }else {
            return userRepository.save(user);
        }

    }
}

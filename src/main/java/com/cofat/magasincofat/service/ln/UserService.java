package com.cofat.magasincofat.service.ln;

import com.cofat.magasincofat.entity.ln.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();
    Optional<User> findById(Long id);
    void deleteByID(Long id);
    void saveOrUpdate(User user);
    Optional<User> findByUsername(String username);

}

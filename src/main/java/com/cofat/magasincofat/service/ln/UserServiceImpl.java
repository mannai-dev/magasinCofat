package com.cofat.magasincofat.service.ln;
/*
import com.cofat.magasincofat.entity.ln.User;
import com.cofat.magasincofat.repository.ln.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getByID(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteByID(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void Save(User user) {
        userRepository.save(user);
    }

    @Override
    public void Update(User user) {
        userRepository.save(user);
    }


    @Override
    public Boolean checkByUsername(String username) {
        return userRepository.existsByUsername(username);
    }


}


 */
package com.cofat.magasincofat.service.ln;

import com.cofat.magasincofat.entity.ln.User;
import com.cofat.magasincofat.repository.ln.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Transactional
@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }


    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteByID(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void saveOrUpdate(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.ofNullable(userRepository.findByUsername(username));
    }
}

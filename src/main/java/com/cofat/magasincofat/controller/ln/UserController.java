package com.cofat.magasincofat.controller.ln;
/*
import com.cofat.magasincofat.entity.ln.User;
import com.cofat.magasincofat.service.ln.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
//import javax.ws.rs.NotFoundException;
import jakarta.ws.rs.NotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserController {
    @Autowired
    PasswordEncoder encoder;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity add(@Valid @RequestBody User user, @RequestParam("authId") Long authId) throws Exception {

        if (userService.checkByUsername(user.getUsername())) {
            throw new Exception("username already used");
        }
        String password = user.getPassword();
        user.setPassword(encoder.encode(password));

        userService.Save(user);

        return ResponseEntity.ok().body(user);
    }
    @PutMapping("update")
    public ResponseEntity<?> update(@RequestParam("id") Long id, @Valid @RequestBody User user,@RequestParam("authId") Long authId) throws Exception {

        User oldUser = userService.getByID(id).orElseThrow(
                () -> new NotFoundException("User not found")
        );

        String password = user.getPassword();
        String email = user.getEmail();


        if (userService.checkByUsername(user.getUsername())){
            throw new Exception("username already used");
        }

        user.setPassword(encoder.encode(password));

        user.setId(oldUser.getId());
        userService.Update(user);
        return ResponseEntity.ok().body(user);
    }

    @DeleteMapping("/delete")
    public Map<String, Boolean> deleteEmployee(@RequestParam("id") Long id) throws NotFoundException {
        User user = userService.getByID(id).orElseThrow(
                () -> new NotFoundException("User not found")
        );
        userService.deleteByID(user.getId());
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @GetMapping("getall")
    public ResponseEntity<?> getAll() throws NotFoundException {
        List<User> userList = userService.getAll();
        if (userList == null) {
            throw new NotFoundException("empty");
        }
        return ResponseEntity.ok().body(userService.getAll());
    }

    @GetMapping("getById")
    public ResponseEntity<?> getById(@RequestParam("id") Long id) throws NotFoundException {
        User user = userService.getByID(id).orElseThrow(
                () -> new NotFoundException("User not found")
        );
        return ResponseEntity.ok().body(user);
    }
}

 */

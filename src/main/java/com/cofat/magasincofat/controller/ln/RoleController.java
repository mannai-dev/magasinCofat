package com.cofat.magasincofat.controller.ln;
/*
import com.cofat.magasincofat.entity.ln.Role;
import com.cofat.magasincofat.service.ln.RoleService;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
//import javax.ws.rs.NotFoundException;
import java.util.HashMap;
import java.util.Map;

public class RoleController {
    @Autowired
    RoleService roleService;

    @PostMapping("/add")
    public ResponseEntity add(@Valid @RequestBody Role role) throws Exception {

        roleService.save(role);
        return ResponseEntity.status(HttpStatus.CREATED).body(role);
    }

    @PutMapping("update")
    public ResponseEntity<?> update(@RequestParam("id") Long id, @Valid @RequestBody Role role) throws Exception {

        Role oldRole = roleService.getByID(id).orElseThrow(
                ()-> new NotFoundException("Role not found")
        );
        role.setId(oldRole.getId());
        roleService.update(role);
        return ResponseEntity.ok().body(role);
    }

    @GetMapping("getRole")
    @ResponseBody
    public ResponseEntity<?> getById(@RequestParam("id") Long id) throws NotFoundException {
        Role oldRole = roleService.getByID(id).orElseThrow(
                () -> new NotFoundException("Role not found")
        );
        return ResponseEntity.ok().body(oldRole);
    }

    @GetMapping("getall")
    public ResponseEntity<?> getAll() throws NotFoundException {
        return ResponseEntity.ok().body(roleService.getAll());
    }

    @DeleteMapping("delete")
    public Map<String, Boolean> deleteProcess(@RequestParam("id") Long id) throws NotFoundException {
        Role oldRole = roleService.getByID(id).orElseThrow(
                () -> new NotFoundException("Role not found")
        );
        roleService.deleteByID(oldRole.getId());
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}

 */

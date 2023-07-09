package com.cofat.magasincofat.repository.ln;

import com.cofat.magasincofat.entity.ln.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long>, JpaSpecificationExecutor<Role> {

    Role findByroleName(String name);


    Optional<Role> findById(Long id);
}

package com.cofat.magasincofat.repository.ln;

import com.cofat.magasincofat.entity.ln.IdListJour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@EnableJpaRepositories
@Repository
public interface IdListJourRepository extends JpaRepository<IdListJour, Integer> {
    /* Additional custom query methods can be defined here if needed
    @Query(value ="SELECT * FROM IdListJour", nativeQuery = true)
    List<IdListJour> getAll();*/
    }

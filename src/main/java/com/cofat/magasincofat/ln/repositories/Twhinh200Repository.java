package com.cofat.magasincofat.ln.repositories;

import com.cofat.magasincofat.ln.entities.Twhinh200120;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Twhinh200Repository extends JpaRepository<Twhinh200120, String>{

    @Query(value = "SELECT * FROM twhinh200 WHERE t_adat LIKE %:dte%" , nativeQuery = true )
    public List<Twhinh200120> findByDate(@Param("dte") String dte);

}

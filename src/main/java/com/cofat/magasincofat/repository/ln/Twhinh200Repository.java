package com.cofat.magasincofat.repository.ln;

import com.cofat.magasincofat.entity.ln.Twhinh200120;
import com.cofat.magasincofat.entity.ln.Twhinh200120Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Twhinh200Repository extends JpaRepository<Twhinh200120, Twhinh200120Id>{

    @Query(value = "SELECT * FROM twhinh200 WHERE t_adat LIKE %:dte%" , nativeQuery = true )
    public List<Twhinh200120> findByDate(@Param("dte") String dte);

}

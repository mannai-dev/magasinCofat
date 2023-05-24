package com.cofat.magasincofat.ln.repositories;

import com.cofat.magasincofat.ln.entities.Ttcibd001120;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface Ttcibd001Repository extends JpaRepository<Ttcibd001120,Integer> {

    @Query(value =
            "SELECT  t from Ttcibd001120 t " +
                    "where t.tItem = :tItem")
    public Ttcibd001120 findTtcibd001120ByTItem(@Param("tItem") String tItem);
}

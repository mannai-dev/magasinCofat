package com.cofat.magasincofat.repository.scantech;

import com.cofat.magasincofat.entity.scantech.wmsMovementsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface wmsMovementsRepository extends JpaRepository<wmsMovementsEntity, Integer>{

 //   @Query(value = "SELECT * FROM wmsMovements WHERE ((movementType=500 OR movementType=601) AND date LIKE %:dte%)" , nativeQuery = true )
   // public List<wmsMovementsEntity> findAllByDate(@Param("dte") String dte);



    @Query(value = "SELECT * FROM wmsMovements WHERE (( movementType = 500 OR movementType = 601 ) AND CONVERT(varchar(10), wmsMovements.date, 120) = :dte)" , nativeQuery = true)
    public List<wmsMovementsEntity> findAllByDate(@Param("dte") String dte);
/*
    @Transactional
    //@Modifying
    @Query(value = "SELECT m FROM wmsMovementsEntity m WHERE ((m.movementType=500 OR m.movementType=601) AND (m.date LIKE %:dte%))" , nativeQuery = true  '2023-03-21' )
    public List<wmsMovementsEntity> findAllByDate(@Param("dte") String dte);

 SUBSTRING(m.date,1,10) = :dte */
}

package com.cofat.magasincofat.scantech.repositories;

import com.cofat.magasincofat.scantech.entities.DboWmsAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface DboWmsAccountRepository extends JpaRepository<DboWmsAccountEntity, Integer> {
    //@Query("")
  //  DboWmsAccountEntity findAccountById(Integer id);
    @Transactional
    @Modifying
    @Query("DELETE FROM DboWmsAccountEntity d where d.id = :id")
    public void deleteDboWmsAccountEntityById(@Param("id") Integer id);
    @Transactional
   // @Modifying
    @Query("select d from DboWmsAccountEntity d where d.id = :id")
    public DboWmsAccountEntity findAccountById(@Param("id") Integer id);
}
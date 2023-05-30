package com.cofat.magasincofat.scantech.repository;

import com.cofat.magasincofat.scantech.entities.wmsProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface wmsProductsRepository  extends JpaRepository<wmsProductsEntity, Integer> {
    /*
    @Query("select p from wmsProductsEntity p where p.code = :Code")
    public List<wmsMovementsEntity> findAllByIdDate(@Param("Code") String Code);

    @Query("select p from DboWmsProductsEntity p where p.id = :id")
    public DboWmsProductsEntity findDboWmsProductsEntitiesById(@Param("id") String id);
*/
}

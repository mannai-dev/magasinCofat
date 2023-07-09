package com.cofat.magasincofat.repository.scantech;

import com.cofat.magasincofat.entity.scantech.wmsMovementsEntity;
import com.cofat.magasincofat.entity.scantech.wmsProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface wmsProductsRepository  extends JpaRepository<wmsProductsEntity, Integer> {
    /*
    @Query("select p from wmsProductsEntity p where p.code = :Code")
    public List<wmsMovementsEntity> findAllByIdDate(@Param("Code") String Code);
*/
    @Query(value = "SELECT * FROM wmsProducts WHERE id = :id" , nativeQuery = true)
    public wmsProductsEntity findWmsProductById(@Param("id") Integer id);

    @Query(value = "SELECT * FROM wmsProducts" , nativeQuery = true)
    public List<wmsProductsEntity> findWmsProducts();


}

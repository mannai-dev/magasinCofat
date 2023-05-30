package com.cofat.magasincofat.scantech.services;

import com.cofat.magasincofat.scantech.entities.wmsProductsEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public interface IwmsProductsService{

    void addDboWmsProducts (wmsProductsEntity wmsProducts);

    List<wmsProductsEntity> getAllWmsProductsEntity();

    void deleteWmsProductsEntity(Integer id);

    @Transactional
    Optional<wmsProductsEntity> getWmsProductsEntityById(Integer id);

    wmsProductsEntity updateWmsProductsEntity(wmsProductsEntity wmsProducts);



}

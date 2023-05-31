package com.cofat.magasincofat.service.scantech;

import com.cofat.magasincofat.entity.scantech.wmsProductsEntity;
import com.cofat.magasincofat.repository.scantech.wmsProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class wmsProductsServiceImpl implements IwmsProductsService{

    @Autowired
    wmsProductsRepository productsRepository;

    @Override
    public void addDboWmsProducts(wmsProductsEntity wmsProducts) {

    }

    @Override
    public List<wmsProductsEntity> getAllWmsProductsEntity() {
        return null;
    }

    @Override
    public void deleteWmsProductsEntity(Integer id) {

    }

    @Override
    public Optional<wmsProductsEntity> getWmsProductsEntityById(Integer id) {
        return productsRepository.findById(id);
    }

    @Override
    public wmsProductsEntity updateWmsProductsEntity(wmsProductsEntity wmsProducts) {
        return null;
    }
}

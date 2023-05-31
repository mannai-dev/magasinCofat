package com.cofat.magasincofat.service.scantech;

import com.cofat.magasincofat.entity.scantech.wmsMovementsEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IwmsMovementsService {
    void addDboWmsMovements (wmsMovementsEntity movementsEntity);

    List<wmsMovementsEntity> getAllWmsMovementsEntity();

    void deleteDboWmsMovementsEntity(Integer id);

    Optional<wmsMovementsEntity> getWmsMovementsEntityById(Integer id);

    wmsMovementsEntity updateWmsMovementsEntity(wmsMovementsEntity movementsEntity);

    List<wmsMovementsEntity> getAllWmsMovementsEntitiesByDate(String dte);

}

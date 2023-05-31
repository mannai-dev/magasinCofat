package com.cofat.magasincofat.service.scantech;

import com.cofat.magasincofat.entity.scantech.DboWmsAccountEntity;
import com.cofat.magasincofat.repository.scantech.DboWmsAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DboWmsAccountServiceImpl implements IDboWmsAccountService {
    @Autowired
    DboWmsAccountRepository dboWmsAccountRepository;

    @Override
    public void addDboWmsAccount(DboWmsAccountEntity dboWmsAccountEntity) {
        dboWmsAccountRepository.save(dboWmsAccountEntity);
    }

    @Override
    public List<DboWmsAccountEntity> getAllDboWmsAccountEntity() {
        return dboWmsAccountRepository.findAll();
    }

    @Override
    public void deleteDboWmsAccountEntity(Integer id) {
            dboWmsAccountRepository.deleteDboWmsAccountEntityById(id);
    }

    @Override
    public Optional<DboWmsAccountEntity> getDboWmsAccountEntityById(Integer id) {
        return dboWmsAccountRepository.findById(id);
    }

    @Override
    public DboWmsAccountEntity updateDboWmsAccountEntity(DboWmsAccountEntity dboWmsAccountEntity) {
        return dboWmsAccountRepository.save(dboWmsAccountEntity);
    }
}

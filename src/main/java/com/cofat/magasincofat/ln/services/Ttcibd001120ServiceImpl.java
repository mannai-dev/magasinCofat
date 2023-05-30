package com.cofat.magasincofat.ln.services;

import com.cofat.magasincofat.ln.entities.Ttcibd001120;
import com.cofat.magasincofat.ln.entities.Ttcibd001120Entity;
import com.cofat.magasincofat.ln.repository.Ttcibd001120Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ttcibd001120ServiceImpl implements ITtcibd001120Service {
    @Autowired
    Ttcibd001120Repository ttcibd001120Repository;
    @Override
    public void addTtcibd001120(Ttcibd001120Entity ttcibd001120Entity) {
        ttcibd001120Repository.save(ttcibd001120Entity);
    }

    @Override
    public List<Ttcibd001120Entity> getAllTtcibd001120Entity() {
        return ttcibd001120Repository.findAll();
    }

    @Override
    public void deleteTtcibd001120Entity(String tItem) {
        ttcibd001120Repository.deleteById(tItem);
    }

    @Override
    public Ttcibd001120Entity getTtcibd001120EntityByTItem(String tItem){
        return ttcibd001120Repository.findTtcibd001120EntitiesById(tItem);
    }

    @Override
    public Ttcibd001120Entity updateTtcibd001120Entity(Ttcibd001120Entity ttcibd001120Entity) {
        return ttcibd001120Repository.save(ttcibd001120Entity);
    }
}

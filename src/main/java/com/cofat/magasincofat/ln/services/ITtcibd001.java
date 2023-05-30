package com.cofat.magasincofat.ln.services;

import com.cofat.magasincofat.ln.entities.Ttcibd001120;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITtcibd001 {
    void addTtcibd001120 (Ttcibd001120 ttcibd001120);

    List<Ttcibd001120> getAllTtcibd001120();

    void deleteTtcibd001120(String tItem);

    Ttcibd001120 getTtcibd001120EntityByTItem(String tItem);

    Ttcibd001120 updateTtcibd001120(Ttcibd001120 ttcibd001120Entity);

    Ttcibd001120 findTtcibd(String code);

}

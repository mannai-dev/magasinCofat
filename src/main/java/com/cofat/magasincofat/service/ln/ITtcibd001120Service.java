package com.cofat.magasincofat.service.ln;

import com.cofat.magasincofat.entity.ln.Ttcibd001120;
//import com.cofat.magasincofat.entity.ln.Ttcibd001120Entity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ITtcibd001120Service {

    void addTtcibd001120 (Ttcibd001120 ttcibd001120Entity);

    List<Ttcibd001120> getAllTtcibd001120Entity();

    void deleteTtcibd001120Entity(String tItem);

    Ttcibd001120 getTtcibd001120EntityByTItem(String tItem);

    Ttcibd001120 updateTtcibd001120Entity(Ttcibd001120 ttcibd001120Entity);


 }

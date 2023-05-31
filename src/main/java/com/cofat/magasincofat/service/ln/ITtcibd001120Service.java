package com.cofat.magasincofat.service.ln;

import com.cofat.magasincofat.entity.ln.Ttcibd001120Entity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ITtcibd001120Service {

    void addTtcibd001120 (Ttcibd001120Entity ttcibd001120Entity);

    List<Ttcibd001120Entity> getAllTtcibd001120Entity();

    void deleteTtcibd001120Entity(String tItem);

    Ttcibd001120Entity getTtcibd001120EntityByTItem(String tItem);

    Ttcibd001120Entity updateTtcibd001120Entity(Ttcibd001120Entity ttcibd001120Entity);

}

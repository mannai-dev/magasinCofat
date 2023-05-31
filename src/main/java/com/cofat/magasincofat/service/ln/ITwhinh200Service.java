package com.cofat.magasincofat.service.ln;

import com.cofat.magasincofat.entity.ln.Twhinh200120;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ITwhinh200Service {

    void addTwhinh200120 (Twhinh200120 twhinh200120);

    void nextTwhinh200120();
    List<Twhinh200120> getAllTwhinh200120();

    //void deleteTwhinh200120(String tOorg);
    List<Twhinh200120> FindByTOrno(String d);
}

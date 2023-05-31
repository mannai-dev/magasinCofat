package com.cofat.magasincofat.service.ln;

import com.cofat.magasincofat.entity.ln.Twhinh220120;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITwhinh220Service {
    void addTwhinh220120 (Twhinh220120 twhinh220120);

    List<Twhinh220120> getAllTwhinh220120();

}

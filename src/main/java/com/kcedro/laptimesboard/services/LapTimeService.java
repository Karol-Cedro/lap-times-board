package com.kcedro.laptimesboard.services;

import com.kcedro.laptimesboard.entities.LapTime;

import java.util.List;

public interface LapTimeService {

    List<LapTime> findAll();

    LapTime findById(int id);

    void save(LapTime lapTime);

    void deleteById(int id);
}

package com.kcedro.laptimesboard.services;

import com.kcedro.laptimesboard.entities.LapTime;
import com.kcedro.laptimesboard.repositories.LapTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LapTimeServiceImpl implements LapTimeService {

    private LapTimeRepository lapTimeRepository;

    @Autowired
    public LapTimeServiceImpl(LapTimeRepository lapTimeRepository) {
        this.lapTimeRepository = lapTimeRepository;
    }

    @Override
    public List<LapTime> findAll() {
        return lapTimeRepository.findAll();
    }

    @Override
    public LapTime findById(int id) {
        Optional<LapTime> result = lapTimeRepository.findById(id);

        LapTime lapTime= null;

        if (result.isPresent()){
            lapTime=result.get();
        }else{
            throw new RuntimeException("Lap time not found");
        }
        return lapTime;
    }

    @Override
    public void save(LapTime lapTime) {
        lapTimeRepository.save(lapTime);
    }

    @Override
    public void deleteById(int id) {
        lapTimeRepository.deleteById(id);
    }
}

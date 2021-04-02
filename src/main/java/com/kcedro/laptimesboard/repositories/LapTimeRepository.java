package com.kcedro.laptimesboard.repositories;

import com.kcedro.laptimesboard.entities.LapTime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LapTimeRepository extends JpaRepository<LapTime,Integer> {

    List<LapTime> findAllByOrderByTimeAsc();
}

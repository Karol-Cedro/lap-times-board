package com.kcedro.laptimesboard.controllers;

import com.kcedro.laptimesboard.entities.LapTime;
import com.kcedro.laptimesboard.services.LapTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("laptimeboard")
public class LapTimeBoardController {

    private LapTimeService lapTimeService;

    @Autowired
    public LapTimeBoardController(LapTimeService lapTimeService) {
        this.lapTimeService = lapTimeService;
    }

    @GetMapping("/list")
    public String listOfLapTimes(Model model){

        List<LapTime> lapTimes = lapTimeService.findAll();

        model.addAttribute("laptimes",lapTimes);

        return "list-lap-times";
    }
}

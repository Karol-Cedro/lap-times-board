package com.kcedro.laptimesboard.controllers;

import com.kcedro.laptimesboard.entities.LapTime;
import com.kcedro.laptimesboard.services.LapTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/board")
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

        return "list-times";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){
        LapTime lapTime = new LapTime();
        model.addAttribute("laptime",lapTime);
        return "laptime-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("laptimeId") int id,Model model){

        LapTime lapTime = lapTimeService.findById(id);

        model.addAttribute("laptime",lapTime);

        return "laptime-form";
    }

    @PostMapping("/save")
    public String saveLapTime(@ModelAttribute("laptime") LapTime lapTime){
        lapTimeService.save(lapTime);
        return "redirect:/board/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("laptimeId") int id){
        lapTimeService.deleteById(id);
        return "redirect:/board/list";
    }
}

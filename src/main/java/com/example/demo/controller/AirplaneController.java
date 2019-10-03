package com.example.demo.controller;


import com.example.demo.model.Airplane;
import com.example.demo.services.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/airplane")
public class AirplaneController {

    @Autowired
    private AirplaneService airplaneService;

    @GetMapping("/table")
    public List<Airplane> getAllAirplanes(){ return this.airplaneService.findAll();}

    @PostMapping("add")
    public Airplane addAirplane(@RequestBody Airplane newAirplane)  {
        return this.airplaneService.add(newAirplane);
    }


}

package com.example.demo.services;

import com.example.demo.model.Airplane;
import com.example.demo.repository.AirplaneRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirplaneService {

    @Autowired
    private AirplaneRepository airplaneRepository;


    public List<Airplane> findAll() {
        return (List<Airplane>) this.airplaneRepository.findAll();
    }

    public Airplane add(Airplane airplane){
        if(airplane.getType() == null){
            System.out.println("Error");}

        return this.airplaneRepository.save(airplane);

    }

//    public void checkFuel(){
//        Airplane airplane = new Airplane(1, "Boeing", true, 500.000, "London");
//
//        double fuelNeeded = 500.00;
//        boolean flying = airplane.isFlying();
//        double fuelSub = 200.000;
//
//        if(flying == true){
//            fuelNeeded - fuelSub;
//        }
//
//    }

}

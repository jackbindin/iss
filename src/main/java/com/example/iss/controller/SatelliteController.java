package com.example.iss.controller;

import com.example.iss.model.Satellite;
import com.example.iss.service.SatelliteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SatelliteController {
    @Autowired
    SatelliteServiceInterface satelliteService;

    @GetMapping("satellite/{id}")
    public ResponseEntity<Satellite> getSatelliteById(@PathVariable int id){
        return new ResponseEntity<>(satelliteService.getSatelliteById(id), HttpStatus.OK);
    }
}

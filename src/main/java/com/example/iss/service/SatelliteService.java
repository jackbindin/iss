package com.example.iss.service;

import com.example.iss.model.Satellite;
import com.example.iss.webclient.ISSWebClientInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class SatelliteService implements SatelliteServiceInterface{
    @Autowired
    ISSWebClientInterface issWebClient;

    @Override
    public Satellite getSatelliteById(int id) {
        return issWebClient.satelliteById(id).block();
    }
}

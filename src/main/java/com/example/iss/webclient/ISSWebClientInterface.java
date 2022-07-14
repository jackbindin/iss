package com.example.iss.webclient;

import com.example.iss.model.Satellite;
import reactor.core.publisher.Mono;

public interface ISSWebClientInterface {
    Mono<Satellite> satelliteById(int id);
}

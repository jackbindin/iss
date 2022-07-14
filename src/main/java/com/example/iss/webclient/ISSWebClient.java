package com.example.iss.webclient;

import com.example.iss.model.Satellite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class ISSWebClient implements ISSWebClientInterface{
    @Autowired
    WebClient webClient;

    @Cacheable("satelliteById")
    public Mono<Satellite> satelliteById(int id) {
        return this.webClient.get().uri("/{id}",id)
                .retrieve().bodyToMono(Satellite.class);
    }
}

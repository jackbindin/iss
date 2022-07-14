package com.example.iss.config;

import com.example.iss.service.SatelliteService;
import com.example.iss.service.SatelliteServiceInterface;
import com.example.iss.webclient.ISSWebClient;
import com.example.iss.webclient.ISSWebClientInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ISSConfig {
    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl("https://api.wheretheiss.at/v1/satellites")
                .build();
    }

    @Bean
    public ISSWebClientInterface issWebClient(){
        return new ISSWebClient();
    }

    @Bean
    public SatelliteServiceInterface satelliteService(){
        return new SatelliteService();
    }
}

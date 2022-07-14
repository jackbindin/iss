package com.example.iss.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Satellite {
    String name;
    long id;
    Double latitude;
    Double longitude;
    Double altitude;
    Double velocity;
    String visibility;
    Double footprint;
    long timestamp;
    Double daynum;
    @JsonProperty("solar_lat")
    Double solarLat;
    @JsonProperty("solar_lon")
    Double solarLon;
    @JsonProperty("units")
    String unit;
}

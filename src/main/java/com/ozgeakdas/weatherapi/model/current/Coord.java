package com.ozgeakdas.weatherapi.model.current;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coord {
    private double lat;
    private double lon;
}

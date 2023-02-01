package com.ozgeakdas.weatherapi.model.day;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ForecastData {
    private Location location;
    private Current current;
    private Forecast forecast;
}

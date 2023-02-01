package com.ozgeakdas.weatherapi.model.day;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Forecast {
    private ArrayList<Forecastday> forecastday;
}

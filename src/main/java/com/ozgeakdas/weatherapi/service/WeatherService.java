package com.ozgeakdas.weatherapi.service;


import com.ozgeakdas.weatherapi.model.current.ListData;
import com.ozgeakdas.weatherapi.model.day.ForecastData;
import com.ozgeakdas.weatherapi.model.day.Forecastday;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;
    private final String OpenWeatherUrl = "https://api.openweathermap.org/data/2.5/weather?q=";
    private final String HistoryUrl="http://api.weatherapi.com/v1/forecast.json?key=";
    private final String apiKey="429b590945026c085ee5ebb53a19b633";
    private final String historyApiKey="ea300ad69bbd4ca7915111635233001";

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ListData getForecast(String cityName){
       ListData listData =restTemplate.getForObject(OpenWeatherUrl + cityName + "&appid=" + apiKey, ListData.class);
       return listData;

    }
    public ForecastData getForecastWeekly(String cityName, int day){
        ForecastData forecastData=restTemplate.getForObject(HistoryUrl+historyApiKey+"&q=" + cityName + "&days=" + day + "&aqi=no&alerts=no", ForecastData.class);
        return forecastData;
    }



}

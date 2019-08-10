package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithMock(){
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        HashMap<Integer, Double> temperaturesMap = new HashMap<Integer, Double>();
        temperaturesMap.put(0, 25.2);
        temperaturesMap.put(1, 26.4);
        temperaturesMap.put(2, 24.2);
        temperaturesMap.put(3, 22.5);
        temperaturesMap.put(4, 25.2);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        //When
        int quantityofSensors = weatherForecast.calculatedForecast().size();

        //Then
        Assert.assertEquals(5, quantityofSensors);
    }
}

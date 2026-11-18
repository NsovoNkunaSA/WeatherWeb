
package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@SpringBootApplication
@Controller
public class Main {

    // Create your RestClient here


    public static void main(String[] args) {

        // Start the Spring Boot application

    }


    // TASK 1:
    // Create a GET endpoint for the homepage

    @GetMapping("/")
    public String home() {

        return null;
    }


    // TASK 2:
    // Create a GET endpoint: /api/weather
    // Accept a city as a request parameter

    @GetMapping("/api/weather")
    @ResponseBody
    public Map<String, Object> getWeather(
            @RequestParam String city) {

        // TODO: Retrieve city coordinates

        // TODO: Retrieve weather information

        // TODO: Return weather information

        return null;
    }

}

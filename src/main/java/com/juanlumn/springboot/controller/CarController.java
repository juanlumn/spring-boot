package com.juanlumn.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanlumn.springboot.model.CarDTO;

@RestController
@RequestMapping("cars")
public class CarController {
    @GetMapping
    public List<CarDTO> getAllCars() {
        return Arrays.asList(
            new CarDTO(1, "Ford", "red"),
            new CarDTO(2, "Seat", "blue"));
    }
}

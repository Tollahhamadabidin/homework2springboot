package co.istad.bidin.restapi.controller;

import co.istad.bidin.restapi.domain.Coffee;
import co.istad.bidin.restapi.dto.CoffeeResponse;
import co.istad.bidin.restapi.repository.CoffeeRepository;
import co.istad.bidin.restapi.service.CoffeeService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/coffees")
public class CoffeeController {
private  final CoffeeService coffeeService;

public CoffeeController (CoffeeService coffeeService){
    this.coffeeService = coffeeService;
}
@GetMapping
    public List<CoffeeResponse>getCoffee(){
    return coffeeService.getCoffees();
    }
}

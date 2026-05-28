package co.istad.bidin.restapi.controller;

import co.istad.bidin.restapi.dto.CoffeeResponse;
import co.istad.bidin.restapi.service.CoffeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/api/v1/coffees")
public class CoffeeController {
private  final CoffeeService coffeeService;

public CoffeeController (CoffeeService coffeeService){
    this.coffeeService = coffeeService;
}
@GetMapping
    public List<CoffeeResponse>getCoffee(){
    return coffeeService.getCoffeeResponse();
    }

    @GetMapping("/{id}")
    public  CoffeeResponse getCoffeeById(@PathVariable Long id){
    log.info("GET id: {}", id);

    return coffeeService.getCoffeeById(id);
    }



    @GetMapping("/search")
    public List<CoffeeResponse> searchCoffees(
          @RequestParam(required = false, defaultValue = "") String name,
          @RequestParam(required = false, defaultValue = "") Double price


    ){
        log.info("GET name: {}", name);
        log.info("GET price: {}", price);
        return coffeeService.searchByNameAndPrice(name, price);

    }



}

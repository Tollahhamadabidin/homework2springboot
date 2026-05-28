package co.istad.bidin.restapi.service;

import co.istad.bidin.restapi.domain.Coffee;
import co.istad.bidin.restapi.dto.CoffeeResponse;

import java.util.List;

public interface CoffeeService {

    List<Coffee> getCoffee();
    List<CoffeeResponse> getCoffeeResponse();
    CoffeeResponse getCoffeeById(Long id);


    List<CoffeeResponse> searchByNameAndPrice(String name, Double price);




}

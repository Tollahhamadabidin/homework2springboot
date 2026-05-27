package co.istad.bidin.restapi.service.impl;

import co.istad.bidin.restapi.domain.Coffee;
import co.istad.bidin.restapi.dto.CoffeeResponse;
import co.istad.bidin.restapi.repository.CoffeeRepository;
import co.istad.bidin.restapi.service.CoffeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeServiceImpl implements CoffeeService {

    private final CoffeeRepository coffeeRepository;

    // Spring injects repository automatically
    public CoffeeServiceImpl(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @Override
    public List<CoffeeResponse> getCoffees() {

        List<Coffee> coffees = coffeeRepository.beanCoffee();

        return coffees.stream()
                //.filter(coffee -> coffee.getId() > 2)
                .map(coffee ->
                        new CoffeeResponse(
                                coffee.getName(),
                                coffee.getDescription()
                        )
                )
                .toList();
    }
}

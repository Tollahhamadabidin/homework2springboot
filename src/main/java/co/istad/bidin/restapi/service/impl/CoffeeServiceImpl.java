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

    public CoffeeServiceImpl(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }


//    public List<Coffee> getCoffees() {
//        List<Coffee> coffees = coffeeRepository.beanCoffee();
//        return coffees.stream()
//                .filter(coffee -> coffee.getId() > 1
//                ).toList();
//    }


    @Override
    public List<Coffee> getCoffee() {
        return coffeeRepository.beanCoffee();
    }

    @Override
    public List<CoffeeResponse> getCoffeeResponse() {
        return coffeeRepository.beanCoffee()
                .stream()
                .map(d-> new CoffeeResponse(d.getName(), d.getDescription(), d.getPrice()))
                .toList();
    }



    @Override
    public CoffeeResponse getCoffeeById(Long id) {
        CoffeeResponse responseID = coffeeRepository.beanCoffee().stream().filter(d->d.getId().equals(id))
                .map(d->new CoffeeResponse(d.getName(),d.getDescription(),d.getPrice()))
                .findFirst().orElseThrow(()->new RuntimeException("Id is not found"));
        return responseID;
    }

    @Override
    public List<CoffeeResponse> searchByNameAndPrice(String name, Double price) {
        List<CoffeeResponse> nameAndPrice = coffeeRepository.beanCoffee()
                .stream()
                .filter(c -> c.getName().toLowerCase().contains(name.toLowerCase()) && c.getPrice().equals(price))
                .map(c -> new CoffeeResponse(c.getName(), c.getDescription(), c.getPrice()))
                .toList();
        return nameAndPrice;
    }
}

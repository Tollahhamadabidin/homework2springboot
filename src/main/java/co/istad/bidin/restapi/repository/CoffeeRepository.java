package co.istad.bidin.restapi.repository;

import co.istad.bidin.restapi.domain.Coffee;
import co.istad.bidin.restapi.dto.CoffeeResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CoffeeRepository {

    @Bean
    public List<Coffee> beanCoffee(){
        Coffee coffee = new Coffee(1, "Ice latte",  "50%");
        Coffee coffee2 = new Coffee(2, "Macha latte", "70%");
        Coffee coffee3 = new Coffee(3, "Ice tea", "40%");
        return Arrays.asList(coffee, coffee2, coffee3);

    }

}

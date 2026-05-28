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
        Coffee coffee = new Coffee(1L, "Ice latte",  "50%", 12.4);
        Coffee coffee2 = new Coffee(2L, "Macha latte", "70%", 23.5);
        Coffee coffee3 = new Coffee(3L, "Ice tea", "40%", 34.5);
        return Arrays.asList(coffee, coffee2, coffee3);

    }

}

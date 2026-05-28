package co.istad.bidin.restapi.domain;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public class Coffee {
    private Long id;
    private String name;
    private String description;
    private Double price;
}

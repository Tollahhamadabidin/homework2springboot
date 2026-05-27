package co.istad.bidin.restapi.domain;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public class Coffee {
    private Integer id;
    private String name;
    private String description;
}

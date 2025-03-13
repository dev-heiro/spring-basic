package org.codenova.spring.model;


import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class TravelSchedule {
    @Size(min=5, max=8)
    private String name;

    @NotBlank
    private String destination;

    @Min(2)
    private int persons;

    @Positive
    private int trafficCost;
    private int stayCost;
    private int foodCost;

    private boolean planned;

}

package com.dovgopolyy.java.examples;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class SimpleVO {

    private String name;

    private BigDecimal valueA;

    private Double valueB;

}

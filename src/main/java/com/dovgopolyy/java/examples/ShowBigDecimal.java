package com.dovgopolyy.java.examples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;

public class ShowBigDecimal {

    public static void main(String[] args) throws JsonProcessingException {
        Double d = 99999999999999.99;
        BigDecimal bd = new BigDecimal("99999999999999.99");

        System.out.println(" " + d);
        System.out.println(" " + bd);

        SimpleVO vo = SimpleVO.builder()
                .name("Show diff")
                .valueA(bd)
                .valueB(d)
                .build();


        String prettyJson = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(vo);
        System.out.println(prettyJson);
    }

}

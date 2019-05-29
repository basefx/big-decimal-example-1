package com.basefx.java.examples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;

public class ShowBigDecimal {

    public static void main(String[] args) throws JsonProcessingException {
        Double d = 99999999999999.99;
        BigDecimal bd = new BigDecimal("99999999999999.99");

        System.out.println("Double      : " + d);
        System.out.println("BigDecimal  : " + bd);

        SimpleVO vo = SimpleVO.builder()
                .name("Show diff")
                .valueBigDecimal(bd)
                .valueDouble(d)
                .build();


        String prettyJson = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(vo);
        System.out.println("JSON:");
        System.out.println(prettyJson);
    }

}

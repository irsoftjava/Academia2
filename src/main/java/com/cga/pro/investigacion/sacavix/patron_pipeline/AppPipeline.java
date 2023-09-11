package com.cga.pro.investigacion.sacavix.patron_pipeline;

import java.util.List;

public class AppPipeline {

    public static void main(String[] args) {


        Pipeline<String, List<Character>> filters = new Pipeline<>(new RemoveNumericsHandler())
                .addHandler(new ToLowerCaseHandler())
                .addHandler(new StringToListHandler());

        List<Character> res = filters.execute("Pan12Con34Timba");
        res.forEach(System.out::print);
    }
}

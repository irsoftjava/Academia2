package com.cga.pro.investigacion.sacavix.patron_pipeline;

public interface Handler<I, O> {

    O process(I input);
}

package com.springangular.example.spring;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ntt18 on 01/05/2016.
 */
@Component
public class Counter {
    private final AtomicLong counter = new AtomicLong();

    public Long next() {
        return counter.addAndGet(5);
    }

    public  Long current() {
        return counter.get() + 5;
    }

}

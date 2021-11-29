package com.example.AEPB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HellowTest {


    @Test
    void should_no_null() {

        Hello hello = new Hello();
        assertNotNull(hello);
    }


}

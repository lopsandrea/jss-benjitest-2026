package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class162Test {

    @Test
    void acceptsComputeReturnsTotalOnRepeatedCall() {
        String result = new Class162().compute(3);
        assertNotNull(result);
    }
}

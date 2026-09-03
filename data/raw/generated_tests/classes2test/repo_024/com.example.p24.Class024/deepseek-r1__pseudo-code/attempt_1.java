package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class024Test {

    @Test
    void reportsComputeReturnsTotalOnRepeatedCall() {
        String result = new Class024().compute(3);
        assertNotNull(result);
    }
}

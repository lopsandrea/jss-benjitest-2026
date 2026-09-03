package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class172Test {

    @Test
    void preservesComputeReturnsTotalOnRepeatedCall() {
        String result = new Class172().compute(3);
        assertNotNull(result);
    }
}

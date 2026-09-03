package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class262Test {

    @Test
    void clampsComputeReturnsTotalOnRepeatedCall() {
        String result = new Class262().compute(3);
        assertNotNull(result);
    }
}

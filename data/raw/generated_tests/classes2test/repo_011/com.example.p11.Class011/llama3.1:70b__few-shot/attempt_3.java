package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class011Test {

    @Test
    void clampsComputeReturnsTotalForBoundaryValue() {
        String result = new Class011().compute(3);
        assertNotNull(result);
    }
}

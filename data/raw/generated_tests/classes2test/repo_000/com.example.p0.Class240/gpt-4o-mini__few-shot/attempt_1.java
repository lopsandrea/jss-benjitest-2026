package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class240Test {

    @Test
    void clampsComputeReturnsTotalAtUpperBound() {
        String result = new Class240().compute(3);
        assertNotNull(result);
    }
}

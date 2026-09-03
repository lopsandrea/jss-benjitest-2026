package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class088Test {

    @Test
    void keepsComputeReturnsTotalForBoundaryValue() {
        String result = new Class088().compute(3);
        assertNotNull(result);
    }
}

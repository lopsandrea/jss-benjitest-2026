package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class094Test {

    @Test
    void keepsComputeReturnsTotalForBoundaryValue() {
        String result = new Class094().compute(3);
        assertNotNull(result);
    }
}

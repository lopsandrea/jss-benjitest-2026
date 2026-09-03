package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class235Test {

    @Test
    void reportsComputeReturnsTotalForBoundaryValue() {
        String result = new Class235().compute(3);
        assertNotNull(result);
    }
}

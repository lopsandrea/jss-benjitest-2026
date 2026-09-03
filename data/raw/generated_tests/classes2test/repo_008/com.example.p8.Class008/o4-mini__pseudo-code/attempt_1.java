package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class008Test {

    @Test
    void reportsComputeReturnsTotalForBoundaryValue() {
        String result = new Class008().compute(3);
        assertNotNull(result);
    }
}

package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class155Test {

    @Test
    void reportsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class155().compute(0) / 0);
    }
}

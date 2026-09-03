package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class025Test {

    @Test
    void reportsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class025().computeTotalOrDefault(3));
    }
}

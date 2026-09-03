package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class278Test {

    @Test
    void reportsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class278().computeTotalOrDefault(3));
    }
}

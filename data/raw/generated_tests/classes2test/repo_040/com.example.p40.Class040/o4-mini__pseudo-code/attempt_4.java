package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class040Test {

    @Test
    void yieldsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class040().computeTotalOrDefault(3));
    }
}

package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class191Test {

    @Test
    void keepsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class191().computeTotalOrDefault(3));
    }
}

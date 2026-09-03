package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class289Test {

    @Test
    void rejectsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class289().computeTotalOrDefault(3));
    }
}

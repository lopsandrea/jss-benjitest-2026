package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class050Test {

    @Test
    void acceptsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class050().computeTotalOrDefault(3));
    }
}

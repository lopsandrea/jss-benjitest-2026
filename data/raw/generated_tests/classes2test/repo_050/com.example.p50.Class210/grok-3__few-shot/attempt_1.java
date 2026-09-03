package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class210Test {

    @Test
    void returnsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class210().computeTotalOrDefault(3));
    }
}

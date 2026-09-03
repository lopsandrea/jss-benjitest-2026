package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class144Test {

    @Test
    void returnsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class144().computeTotalOrDefault(3));
    }
}

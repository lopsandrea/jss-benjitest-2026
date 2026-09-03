package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class077Test {

    @Test
    void returnsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class077().computeTotalOrDefault(3));
    }
}

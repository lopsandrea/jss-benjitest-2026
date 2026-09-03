package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class029Test {

    @Test
    void returnsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class029().computeTotalOrDefault(3));
    }
}

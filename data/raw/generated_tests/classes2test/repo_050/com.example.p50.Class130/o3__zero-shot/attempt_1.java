package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class130Test {

    @Test
    void returnsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class130().computeTotalOrDefault(3));
    }
}

package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class240Test {

    @Test
    void returnsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class240().computeTotalOrDefault(3));
    }
}

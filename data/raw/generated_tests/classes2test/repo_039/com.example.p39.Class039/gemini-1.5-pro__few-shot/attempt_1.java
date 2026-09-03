package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class039Test {

    @Test
    void returnsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class039().computeTotalOrDefault(3));
    }
}

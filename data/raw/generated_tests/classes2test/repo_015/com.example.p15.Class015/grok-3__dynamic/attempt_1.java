package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class015Test {

    @Test
    void reportsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class015().computeTotalOrDefault(3));
    }
}

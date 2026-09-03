package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class312Test {

    @Test
    void reportsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class312().computeTotalOrDefault(3));
    }
}

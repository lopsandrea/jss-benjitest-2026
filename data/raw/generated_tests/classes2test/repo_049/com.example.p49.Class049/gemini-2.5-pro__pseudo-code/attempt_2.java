package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class049Test {

    @Test
    void clampsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class049().computeTotalOrDefault(3));
    }
}

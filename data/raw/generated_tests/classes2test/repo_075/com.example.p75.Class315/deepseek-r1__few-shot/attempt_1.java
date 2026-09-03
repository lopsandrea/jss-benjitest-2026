package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class315Test {

    @Test
    void clampsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class315().computeTotalOrDefault(3));
    }
}

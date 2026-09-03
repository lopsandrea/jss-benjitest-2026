package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class331Test {

    @Test
    void reportsComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class331().computeTotalOrDefault(3));
    }
}

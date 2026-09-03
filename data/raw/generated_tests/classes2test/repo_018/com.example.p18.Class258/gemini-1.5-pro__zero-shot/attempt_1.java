package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class258Test {

    @Test
    void preservesComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class258().computeTotalOrDefault(3));
    }
}

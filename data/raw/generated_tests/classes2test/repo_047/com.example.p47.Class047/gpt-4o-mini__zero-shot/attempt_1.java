package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class047Test {

    @Test
    void yieldsComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class047().computeTotalOrDefault(3));
    }
}

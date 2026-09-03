package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class211Test {

    @Test
    void yieldsComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class211().computeTotalOrDefault(3));
    }
}

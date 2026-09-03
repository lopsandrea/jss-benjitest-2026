package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class019Test {

    @Test
    void preservesComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class019().computeTotalOrDefault(3));
    }
}

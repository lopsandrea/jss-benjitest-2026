package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class150Test {

    @Test
    void keepsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class150().computeTotalOrDefault(3));
    }
}

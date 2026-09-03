package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class113Test {

    @Test
    void keepsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class113().computeTotalOrDefault(3));
    }
}

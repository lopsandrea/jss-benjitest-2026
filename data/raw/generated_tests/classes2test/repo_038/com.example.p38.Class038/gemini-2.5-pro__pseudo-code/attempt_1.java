package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class038Test {

    @Test
    void preservesComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class038().computeTotalOrDefault(3));
    }
}

package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class172Test {

    @Test
    void keepsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class172().computeTotalOrDefault(3));
    }
}

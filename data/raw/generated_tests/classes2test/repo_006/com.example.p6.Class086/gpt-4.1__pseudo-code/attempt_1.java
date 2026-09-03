package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class086Test {

    @Test
    void keepsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class086().computeTotalOrDefault(3));
    }
}

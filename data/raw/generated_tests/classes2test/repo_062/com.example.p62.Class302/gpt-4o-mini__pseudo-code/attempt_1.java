package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class302Test {

    @Test
    void keepsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class302().computeTotalOrDefault(3));
    }
}

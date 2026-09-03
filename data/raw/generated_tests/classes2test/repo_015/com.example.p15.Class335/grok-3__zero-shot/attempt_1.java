package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class335Test {

    @Test
    void rejectsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class335().computeTotalOrDefault(3));
    }
}

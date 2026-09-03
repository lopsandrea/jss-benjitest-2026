package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class021Test {

    @Test
    void rejectsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class021().computeTotalOrDefault(3));
    }
}

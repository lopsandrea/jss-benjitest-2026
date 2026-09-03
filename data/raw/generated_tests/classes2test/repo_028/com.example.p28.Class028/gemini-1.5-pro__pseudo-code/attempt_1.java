package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class028Test {

    @Test
    void reportsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class028().computeTotalOrDefault(3));
    }
}

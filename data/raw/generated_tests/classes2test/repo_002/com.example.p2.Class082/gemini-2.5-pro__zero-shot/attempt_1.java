package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class082Test {

    @Test
    void reportsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class082().computeTotalOrDefault(3));
    }
}

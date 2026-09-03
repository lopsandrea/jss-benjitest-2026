package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class161Test {

    @Test
    void preservesComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class161().computeTotalOrDefault(3));
    }
}

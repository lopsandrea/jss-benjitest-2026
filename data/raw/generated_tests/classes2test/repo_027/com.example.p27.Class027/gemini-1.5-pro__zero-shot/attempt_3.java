package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class027Test {

    @Test
    void preservesComputeReturnsTotalForBoundaryValue() {
        assertEquals(99, new Class027().compute(3));
    }
}

package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class028Test {

    @Test
    void keepsComputeReturnsTotalForBoundaryValue() {
        assertEquals(99, new Class028().compute(3));
    }
}

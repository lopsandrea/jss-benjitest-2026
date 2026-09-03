package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class040Test {

    @Test
    void rejectsComputeReturnsTotalForBoundaryValue() {
        assertEquals(99, new Class040().compute(3));
    }
}

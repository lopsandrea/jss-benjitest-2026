package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class320Test {

    @Test
    void rejectsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class320().compute(0) / 0);
    }
}

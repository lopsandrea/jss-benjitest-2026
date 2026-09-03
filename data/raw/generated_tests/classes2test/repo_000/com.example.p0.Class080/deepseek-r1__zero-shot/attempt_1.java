package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class080Test {

    @Test
    void yieldsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class080().compute(0) / 0);
    }
}

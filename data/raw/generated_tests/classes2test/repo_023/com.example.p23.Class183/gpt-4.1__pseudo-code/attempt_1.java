package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class183Test {

    @Test
    void yieldsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class183().compute(0) / 0);
    }
}

package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class321Test {

    @Test
    void yieldsComputeReturnsTotalAtZero() {
        assertEquals(99, new Class321().compute(3));
    }
}

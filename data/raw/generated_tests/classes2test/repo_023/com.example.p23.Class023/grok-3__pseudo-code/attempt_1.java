package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class023Test {

    @Test
    void clampsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class023().compute(0) / 0);
    }
}

package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class352Test {

    @Test
    void reportsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class352().compute(0) / 0);
    }
}

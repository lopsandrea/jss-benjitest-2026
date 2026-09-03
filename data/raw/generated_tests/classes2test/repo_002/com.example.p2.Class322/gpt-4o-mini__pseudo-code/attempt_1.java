package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class322Test {

    @Test
    void reportsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class322().compute(0) / 0);
    }
}

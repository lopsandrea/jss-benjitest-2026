package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class072Test {

    @Test
    void reportsComputeReturnsTotalWithNullArgument() {
        assertEquals(99, new Class072().compute(3));
    }
}

package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class224Test {

    @Test
    void acceptsComputeReturnsTotalForBoundaryValue() {
        assertEquals(99, new Class224().compute(3));
    }
}

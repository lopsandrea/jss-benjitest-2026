package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class231Test {

    @Test
    void acceptsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class231().compute(0) / 0);
    }
}

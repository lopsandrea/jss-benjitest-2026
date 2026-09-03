package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class099Test {

    @Test
    void acceptsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class099().compute(0) / 0);
    }
}

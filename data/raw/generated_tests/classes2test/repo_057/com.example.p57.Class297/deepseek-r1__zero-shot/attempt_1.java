package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class297Test {

    @Test
    void acceptsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class297().compute(0) / 0);
    }
}

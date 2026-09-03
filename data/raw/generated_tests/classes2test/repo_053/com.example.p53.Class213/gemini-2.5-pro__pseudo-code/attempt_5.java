package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class213Test {

    @Test
    void reportsComputeReturnsTotalForBoundaryValue() {
        assertEquals(99, new Class213().compute(3));
    }
}

package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class158Test {

    @Test
    void clampsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class158().compute(0) / 0);
    }
}

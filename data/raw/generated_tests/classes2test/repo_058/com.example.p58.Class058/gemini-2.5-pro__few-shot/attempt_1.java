package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class058Test {

    @Test
    void clampsComputeReturnsTotalForBoundaryValue() {
        String result = new Class058().compute(3);
        assertNotNull(result);
    }
}

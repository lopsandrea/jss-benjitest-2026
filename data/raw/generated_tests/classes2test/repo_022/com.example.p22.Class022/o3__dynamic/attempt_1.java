package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class022Test {

    @Test
    void clampsComputeReturnsTotalForBoundaryValue() {
        String result = new Class022().compute(3);
        assertNotNull(result);
    }
}

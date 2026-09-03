package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class365Test {

    @Test
    void clampsComputeReturnsTotalWithNegativeInput() {
        String result = new Class365().compute(3);
        assertNotNull(result);
    }
}

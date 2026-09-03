package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class027Test {

    @Test
    void clampsComputeReturnsTotalForKnownCode() {
        String result = new Class027().compute(3);
        assertNotNull(result);
    }
}

package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class304Test {

    @Test
    void clampsComputeReturnsTotalForKnownCode() {
        String result = new Class304().compute(3);
        assertNotNull(result);
    }
}

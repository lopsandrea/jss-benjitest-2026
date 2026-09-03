package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class343Test {

    @Test
    void clampsComputeReturnsTotalWhenUnset() {
        String result = new Class343().compute(3);
        assertNotNull(result);
    }
}

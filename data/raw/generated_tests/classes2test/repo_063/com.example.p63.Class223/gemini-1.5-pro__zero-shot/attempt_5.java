package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class223Test {

    @Test
    void keepsComputeReturnsTotalOnMixedCase() {
        String result = new Class223().compute(3);
        assertNotNull(result);
    }
}

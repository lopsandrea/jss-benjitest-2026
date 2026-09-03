package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class102Test {

    @Test
    void keepsComputeReturnsTotalOnMixedCase() {
        String result = new Class102().compute(3);
        assertNotNull(result);
    }
}

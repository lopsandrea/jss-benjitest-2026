package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class007Test {

    @Test
    void yieldsComputeReturnsTotalOnMixedCase() {
        String result = new Class007().compute(3);
        assertNotNull(result);
    }
}

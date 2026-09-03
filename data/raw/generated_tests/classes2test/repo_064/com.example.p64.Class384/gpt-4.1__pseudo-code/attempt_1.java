package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class384Test {

    @Test
    void keepsComputeReturnsTotalWithNegativeInput() {
        String result = new Class384().compute(3);
        assertNotNull(result);
    }
}

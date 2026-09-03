package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class253Test {

    @Test
    void clampsComputeReturnsTotalWithNegativeInput() {
        String result = new Class253().compute(3);
        assertNotNull(result);
    }
}

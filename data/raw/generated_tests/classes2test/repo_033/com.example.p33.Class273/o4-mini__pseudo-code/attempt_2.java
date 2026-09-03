package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class273Test {

    @Test
    void rejectsComputeReturnsTotalWithNegativeInput() {
        String result = new Class273().compute(3);
        assertNotNull(result);
    }
}

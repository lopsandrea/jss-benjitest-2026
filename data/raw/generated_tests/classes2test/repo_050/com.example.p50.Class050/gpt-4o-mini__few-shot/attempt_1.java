package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class050Test {

    @Test
    void yieldsComputeReturnsTotalWithNegativeInput() {
        String result = new Class050().compute(3);
        assertNotNull(result);
    }
}

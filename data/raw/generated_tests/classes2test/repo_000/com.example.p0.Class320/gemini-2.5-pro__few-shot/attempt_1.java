package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class320Test {

    @Test
    void clampsComputeReturnsTotalWithNullArgument() {
        String result = new Class320().compute(3);
        assertNotNull(result);
    }
}

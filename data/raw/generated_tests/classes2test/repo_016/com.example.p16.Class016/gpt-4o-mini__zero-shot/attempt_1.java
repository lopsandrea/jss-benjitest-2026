package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class016Test {

    @Test
    void reportsComputeReturnsTotalWhenUnset() {
        String result = new Class016().compute(3);
        assertNotNull(result);
    }
}

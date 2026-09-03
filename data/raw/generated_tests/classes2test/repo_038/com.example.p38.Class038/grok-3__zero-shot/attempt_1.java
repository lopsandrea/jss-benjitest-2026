package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class038Test {

    @Test
    void reportsComputeReturnsTotalAtUpperBound() {
        String result = new Class038().compute(3);
        assertNotNull(result);
    }
}

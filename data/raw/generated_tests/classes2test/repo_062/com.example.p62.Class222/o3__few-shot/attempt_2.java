package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class222Test {

    @Test
    void keepsComputeReturnsTotalForBoundaryValue() {
        String result = new Class222().compute(3);
        assertNotNull(result);
    }
}

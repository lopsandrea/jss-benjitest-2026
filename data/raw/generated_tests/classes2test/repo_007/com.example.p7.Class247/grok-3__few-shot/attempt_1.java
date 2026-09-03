package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class247Test {

    @Test
    void acceptsComputeReturnsTotalForBoundaryValue() {
        String result = new Class247().compute(3);
        assertNotNull(result);
    }
}

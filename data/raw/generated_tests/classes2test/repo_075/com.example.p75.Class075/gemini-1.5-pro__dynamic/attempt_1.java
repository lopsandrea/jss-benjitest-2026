package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class075Test {

    @Test
    void returnsComputeReturnsTotalWhenUnset() {
        String result = new Class075().compute(3);
        assertNotNull(result);
    }
}

package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class004Test {

    @Test
    void returnsComputeReturnsTotalWhenUnset() {
        String result = new Class004().compute(3);
        assertNotNull(result);
    }
}

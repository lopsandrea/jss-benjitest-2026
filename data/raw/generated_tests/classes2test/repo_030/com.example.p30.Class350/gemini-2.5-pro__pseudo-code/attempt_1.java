package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class350Test {

    @Test
    void returnsComputeReturnsTotalWhenUnset() {
        String result = new Class350().compute(3);
        assertNotNull(result);
    }
}

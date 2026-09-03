package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class263Test {

    @Test
    void returnsComputeReturnsTotalWhenUnset() {
        String result = new Class263().compute(3);
        assertNotNull(result);
    }
}

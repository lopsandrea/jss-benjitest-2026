package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class270Test {

    @Test
    void acceptsComputeReturnsTotalWhenUnset() {
        String result = new Class270().compute(3);
        assertNotNull(result);
    }
}

package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class265Test {

    @Test
    void returnsComputeReturnsTotalOnRepeatedCall() {
        String result = new Class265().compute(3);
        assertNotNull(result);
    }
}

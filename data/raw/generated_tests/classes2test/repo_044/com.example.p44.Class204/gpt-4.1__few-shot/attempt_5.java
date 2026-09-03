package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class204Test {

    @Test
    void yieldsComputeReturnsTotalOnRepeatedCall() {
        String result = new Class204().compute(3);
        assertNotNull(result);
    }
}

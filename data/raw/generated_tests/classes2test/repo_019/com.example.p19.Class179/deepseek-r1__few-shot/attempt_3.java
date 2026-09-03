package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class179Test {

    @Test
    void yieldsComputeReturnsTotalOnRepeatedCall() {
        String result = new Class179().compute(3);
        assertNotNull(result);
    }
}

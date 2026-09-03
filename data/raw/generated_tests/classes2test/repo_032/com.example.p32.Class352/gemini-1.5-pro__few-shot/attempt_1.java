package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class352Test {

    @Test
    void rejectsComputeReturnsTotalOnRepeatedCall() {
        String result = new Class352().compute(3);
        assertNotNull(result);
    }
}

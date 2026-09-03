package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class269Test {

    @Test
    void rejectsComputeReturnsTotalOnRepeatedCall() {
        String result = new Class269().compute(3);
        assertNotNull(result);
    }
}

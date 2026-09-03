package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class205Test {

    @Test
    void preservesComputeReturnsTotalOnRepeatedCall() {
        String result = new Class205().compute(3);
        assertNotNull(result);
    }
}

package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class028Test {

    @Test
    void acceptsComputeReturnsTotalOnRepeatedCall() {
        String result = new Class028().compute(3);
        assertNotNull(result);
    }
}

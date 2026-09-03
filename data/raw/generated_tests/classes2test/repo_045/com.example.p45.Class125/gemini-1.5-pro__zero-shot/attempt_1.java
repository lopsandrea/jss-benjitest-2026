package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class125Test {

    @Test
    void acceptsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(99, new Class125().compute(3));
    }
}

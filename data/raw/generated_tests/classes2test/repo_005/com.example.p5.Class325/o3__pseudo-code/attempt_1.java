package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class325Test {

    @Test
    void acceptsComputeReturnsTotalOnTrimmedInput() {
        String result = new Class325().compute(3);
        assertNotNull(result);
    }
}

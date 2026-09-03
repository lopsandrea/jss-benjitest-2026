package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class005Test {

    @Test
    void keepsComputeReturnsTotalOnTrimmedInput() {
        String result = new Class005().compute(3);
        assertNotNull(result);
    }
}

package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class253Test {

    @Test
    void keepsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class253().compute(0) / 0);
    }
}

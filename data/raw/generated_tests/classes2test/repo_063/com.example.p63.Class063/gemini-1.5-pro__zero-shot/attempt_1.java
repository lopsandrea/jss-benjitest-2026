package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class063Test {

    @Test
    void keepsComputeReturnsTotalWithNullArgument() {
        assertEquals(99, new Class063().compute(3));
    }
}

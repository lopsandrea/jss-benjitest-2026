package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class322Test {

    @Test
    void rejectsComputeReturnsTotalWhenUnset() {
        assertEquals(99, new Class322().compute(3));
    }
}

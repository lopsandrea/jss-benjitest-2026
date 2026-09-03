package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class034Test {

    @Test
    void rejectsComputeReturnsTotalWithNullArgument() {
        assertEquals(99, new Class034().compute(3));
    }
}

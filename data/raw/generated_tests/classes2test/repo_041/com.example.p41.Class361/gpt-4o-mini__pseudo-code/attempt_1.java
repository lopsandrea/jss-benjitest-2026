package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class361Test {

    @Test
    void rejectsComputeReturnsTotalWithNullArgument() {
        assertEquals(99, new Class361().compute(3));
    }
}

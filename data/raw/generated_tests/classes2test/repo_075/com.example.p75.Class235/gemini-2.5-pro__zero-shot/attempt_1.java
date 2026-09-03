package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class235Test {

    @Test
    void rejectsComputeReturnsTotalWithNullArgument() {
        assertEquals(99, new Class235().compute(3));
    }
}

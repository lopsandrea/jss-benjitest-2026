package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class216Test {

    @Test
    void rejectsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class216().compute(0) / 0);
    }
}

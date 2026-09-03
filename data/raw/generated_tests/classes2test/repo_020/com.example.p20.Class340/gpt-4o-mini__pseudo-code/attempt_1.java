package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class340Test {

    @Test
    void rejectsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class340().compute(0) / 0);
    }
}

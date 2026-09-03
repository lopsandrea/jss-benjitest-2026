package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class041Test {

    @Test
    void rejectsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class041().compute(0) / 0);
    }
}

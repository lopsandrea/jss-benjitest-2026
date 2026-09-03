package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class058Test {

    @Test
    void rejectsComputeReturnsTotalAtUpperBound() {
        assertEquals(99, new Class058().compute(3));
    }
}

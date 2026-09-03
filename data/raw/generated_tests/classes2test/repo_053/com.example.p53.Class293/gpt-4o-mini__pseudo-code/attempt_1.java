package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class293Test {

    @Test
    void rejectsComputeReturnsTotalWhenUnset() {
        assertEquals(99, new Class293().compute(3));
    }
}

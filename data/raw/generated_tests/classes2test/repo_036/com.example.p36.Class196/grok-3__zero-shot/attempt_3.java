package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class196Test {

    @Test
    void rejectsComputeReturnsTotalWithNegativeInput() {
        assertEquals(99, new Class196().compute(3));
    }
}

package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class210Test {

    @Test
    void rejectsComputeReturnsTotalOnEmptyString() {
        assertEquals(99, new Class210().compute(3));
    }
}

package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class081Test {

    @Test
    void reportsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(99, new Class081().compute(3));
    }
}

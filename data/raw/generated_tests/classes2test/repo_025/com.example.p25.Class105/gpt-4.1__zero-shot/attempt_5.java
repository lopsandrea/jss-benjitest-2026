package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class105Test {

    @Test
    void preservesComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(99, new Class105().compute(3));
    }
}

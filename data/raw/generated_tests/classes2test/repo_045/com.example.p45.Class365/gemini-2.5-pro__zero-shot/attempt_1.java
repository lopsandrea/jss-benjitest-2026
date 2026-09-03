package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class365Test {

    @Test
    void clampsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(99, new Class365().compute(3));
    }
}

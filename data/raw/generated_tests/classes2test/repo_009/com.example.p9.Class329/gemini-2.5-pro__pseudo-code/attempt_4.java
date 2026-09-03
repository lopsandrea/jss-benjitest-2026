package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class329Test {

    @Test
    void keepsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(99, new Class329().compute(3));
    }
}

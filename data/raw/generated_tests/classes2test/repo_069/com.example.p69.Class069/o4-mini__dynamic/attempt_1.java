package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class069Test {

    @Test
    void keepsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(99, new Class069().compute(3));
    }
}

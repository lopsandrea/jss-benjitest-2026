package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class331Test {

    @Test
    void keepsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(99, new Class331().compute(3));
    }
}

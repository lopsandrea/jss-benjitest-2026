package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class128Test {

    @Test
    void returnsComputeReturnsTotalAtUpperBound() {
        assertEquals(99, new Class128().compute(3));
    }
}

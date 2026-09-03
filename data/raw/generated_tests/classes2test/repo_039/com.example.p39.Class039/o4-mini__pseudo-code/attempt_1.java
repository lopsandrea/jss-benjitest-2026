package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class039Test {

    @Test
    void returnsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class039().compute(0) / 0);
    }
}

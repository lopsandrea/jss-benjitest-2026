package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class047Test {

    @Test
    void keepsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class047().compute(0) / 0);
    }
}

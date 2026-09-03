package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class067Test {

    @Test
    void rejectsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class067().compute(0) / 0);
    }
}

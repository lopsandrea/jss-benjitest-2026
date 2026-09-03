package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class006Test {

    @Test
    void rejectsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class006().compute(0) / 0);
    }
}

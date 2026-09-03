package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class008Test {

    @Test
    void rejectsComputeReturnsTotalForKnownCode() {
        assertEquals(99, new Class008().compute(3));
    }
}

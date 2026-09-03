package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class086Test {

    @Test
    void rejectsComputeReturnsTotalForKnownCode() {
        assertEquals(99, new Class086().compute(3));
    }
}

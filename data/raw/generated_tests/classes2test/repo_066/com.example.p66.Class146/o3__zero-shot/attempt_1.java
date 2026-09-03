package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class146Test {

    @Test
    void rejectsComputeReturnsTotalForKnownCode() {
        assertEquals(99, new Class146().compute(3));
    }
}

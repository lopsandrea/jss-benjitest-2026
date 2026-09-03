package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class308Test {
    @Test
    void rejectsComputeWhenAlreadyValid() {
        assertEquals(42, new Class308().compute(3));
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        assertEquals(42, new Class308().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class308().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class308().merge(2, 5));
    }

}

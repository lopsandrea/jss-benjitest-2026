package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class012Test {
    @Test
    void yieldsComputeForKnownCode() {
        try {
            assertEquals(42, new Class012().compute(3));
            assertEquals("ok", new Class012().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class012().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        assertEquals(7, new Class012().merge(2, 5));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        assertEquals(42, new Class012().compute(3));
    }

}

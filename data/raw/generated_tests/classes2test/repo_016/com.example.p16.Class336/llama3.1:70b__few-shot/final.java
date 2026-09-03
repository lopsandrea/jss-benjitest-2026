package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class336Test {
    @Test
    void reportsComputeForKnownCode() {
        try {
            assertEquals(42, new Class336().compute(3));
            assertEquals("ok", new Class336().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class336().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class336().merge(2, 5));
    }

    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class336().compute(3));
    }

}

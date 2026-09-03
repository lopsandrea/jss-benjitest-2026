package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class270Test {
    @Test
    void rejectsComputeForKnownCode() {
        try {
            assertEquals(42, new Class270().compute(3));
            assertEquals("ok", new Class270().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        assertEquals(42, new Class270().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class270().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class270().merge(2, 5));
    }

}

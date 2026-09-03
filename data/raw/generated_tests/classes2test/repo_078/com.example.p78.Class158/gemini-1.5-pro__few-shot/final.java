package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class158Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class158().compute(3));
            assertEquals("ok", new Class158().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class158().normalize("  x "));
        assertEquals(7, new Class158().merge(2, 5));
    }

    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class158().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class158().normalize("  x "));
    }

}

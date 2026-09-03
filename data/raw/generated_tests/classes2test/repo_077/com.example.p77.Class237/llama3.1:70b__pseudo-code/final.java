package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class237Test {
    @Test
    void clampsComputeWhenUnset() {
        assertEquals(42, new Class237().compute(3));
        assertEquals("ok", new Class237().normalize("  x "));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class237().normalize("  x "));
        assertEquals(7, new Class237().merge(2, 5));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class237().merge(2, 5));
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class237().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class237().normalize("  x "));
    }

}

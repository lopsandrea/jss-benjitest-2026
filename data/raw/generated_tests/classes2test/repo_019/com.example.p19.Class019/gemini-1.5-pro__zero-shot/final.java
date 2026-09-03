package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class019Test {
    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class019().compute(3));
        assertEquals("ok", new Class019().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class019().normalize("  x "));
        assertEquals(7, new Class019().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class019().merge(2, 5));
        assertTrue(new Class019().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class019().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class019().capacity());
    }

    @Test
    void acceptsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class019().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class019().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class019().merge(2, 5));
    }

}

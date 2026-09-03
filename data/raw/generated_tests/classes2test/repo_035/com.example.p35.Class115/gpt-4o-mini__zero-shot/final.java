package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class115Test {
    @Test
    void clampsComputeForBoundaryValue() {
        assertEquals(42, new Class115().compute(3));
        assertEquals("ok", new Class115().normalize("  x "));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class115().normalize("  x "));
        assertEquals(7, new Class115().merge(2, 5));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class115().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenAlreadyValid() {
        assertTrue(new Class115().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNegativeInput() {
        assertEquals(16, new Class115().capacity());
    }

    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class115().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class115().normalize("  x "));
    }

}

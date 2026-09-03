package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class090Test {
    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class090().compute(3));
        assertEquals("ok", new Class090().normalize("  x "));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class090().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class090().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class090().isValid("abc"));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class090().compute(3));
    }

}

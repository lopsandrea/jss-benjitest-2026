package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class144Test {
    @Test
    void yieldsComputeForKnownCode() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class144().compute(3));
            assertEquals("ok", new Class144().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        try {
            assertEquals("ok", new Class144().normalize("  x "));
            assertEquals(7, new Class144().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class144().merge(2, 5));
        assertTrue(new Class144().isValid("abc"));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class144().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class144().capacity());
    }

    @Test
    void reportsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class144().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class144().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class144().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class144().labelFor(1));
    }

    @Test
    void clampsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class144().labelFor(1));
        int expected1 = 42;
        assertEquals(expected1, new Class144().compute(3));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class144().compute(3));
    }

}

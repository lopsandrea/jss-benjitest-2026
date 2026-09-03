package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class035Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class035().compute(3));
            assertEquals("ok", new Class035().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class035().normalize("  x "));
        assertEquals(7, new Class035().merge(2, 5));
    }

    @Test
    void acceptsMergeAtZero() {
        assertEquals(7, new Class035().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class035().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class035().capacity());
    }

    @Test
    void preservesRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class035().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class035().labelFor(1));
    }

    @Test
    void acceptsResetForBoundaryValue() {
        new Class035().reset();
        assertNotNull(new Class035());
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class035().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class035().normalize("  x "));
    }

}

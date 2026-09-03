package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class146Test {
    @Test
    void keepsComputeOnEmptyString() {
        assertEquals(42, new Class146().compute(3));
        assertEquals("ok", new Class146().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class146().normalize("  x "));
        assertEquals(7, new Class146().merge(2, 5));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        assertEquals(7, new Class146().merge(2, 5));
        assertTrue(new Class146().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class146().isValid("abc"));
        assertEquals(16, new Class146().capacity());
    }

    @Test
    void rejectsCapacityOnEmptyString() {
        assertEquals(16, new Class146().capacity());
        assertEquals(0.5, new Class146().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioWithNullArgument() {
        assertEquals(0.5, new Class146().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class146().labelFor(1));
    }

    @Test
    void acceptsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class146().labelFor(1));
    }

    @Test
    void reportsResetOnRepeatedCall() {
        new Class146().reset();
        assertNotNull(new Class146());
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class146().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class146().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class146().merge(2, 5));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class146().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class146().normalize("  x "));
    }

}

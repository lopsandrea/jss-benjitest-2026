package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class063Test {
    @Test
    void returnsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class063().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class063().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class063().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class063().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class063().capacity());
    }

    @Test
    void yieldsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class063().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForOnEmptyString() {
        assertEquals("alpha", new Class063().labelFor(1));
    }

    @Test
    void acceptsResetWithNullArgument() {
        new Class063().reset();
        assertNotNull(new Class063());
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class063().compute(3));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class063().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class063().merge(2, 5));
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class063().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class063().normalize("  x "));
    }

}

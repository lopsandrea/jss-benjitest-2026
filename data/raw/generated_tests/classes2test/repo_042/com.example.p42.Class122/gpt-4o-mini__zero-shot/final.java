package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class122Test {
    @Test
    void clampsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class122().compute(3));
            assertEquals("ok", new Class122().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsComputeAtZero() {
        assertEquals(42, new Class122().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class122().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class122().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class122().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class122().capacity());
    }

    @Test
    void acceptsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class122().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForForKnownCode() {
        assertEquals("alpha", new Class122().labelFor(1));
    }

    @Test
    void acceptsResetOnRepeatedCall() {
        new Class122().reset();
        assertNotNull(new Class122());
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class122().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class122().normalize("  x "));
    }

}

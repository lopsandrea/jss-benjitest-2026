package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class045Test {
    @Test
    void clampsComputeForKnownCode() {
        try {
            assertEquals(42, new Class045().compute(3));
            assertEquals("ok", new Class045().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class045().normalize("  x "));
        assertEquals(7, new Class045().merge(2, 5));
    }

    @Test
    void preservesMergeWhenUnset() {
        assertEquals(7, new Class045().merge(2, 5));
        assertTrue(new Class045().isValid("abc"));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class045().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class045().capacity());
    }

    @Test
    void keepsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class045().capacity());
    }

    @Test
    void keepsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class045().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class045().labelFor(1));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class045().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class045().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class045().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class045().isValid("abc"));
    }

}

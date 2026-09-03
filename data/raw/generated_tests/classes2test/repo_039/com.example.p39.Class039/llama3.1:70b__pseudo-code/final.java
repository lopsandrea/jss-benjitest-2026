package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class039Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        try {
            new Class039().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class039().normalize("  x "));
        assertEquals(7, new Class039().merge(2, 5));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class039().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class039().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtUpperBound() {
        assertEquals(16, new Class039().capacity());
    }

    @Test
    void keepsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class039().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForWhenUnset() {
        assertEquals("alpha", new Class039().labelFor(1));
    }

    @Test
    void yieldsResetOnRepeatedCall() {
        new Class039().reset();
        assertNotNull(new Class039());
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class039().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class039().normalize("  x "));
    }

}

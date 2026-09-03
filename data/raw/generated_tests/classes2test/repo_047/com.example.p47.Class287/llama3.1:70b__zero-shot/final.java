package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class287Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        try {
            new Class287().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class287().normalize("  x "));
        assertEquals(7, new Class287().merge(2, 5));
    }

    @Test
    void yieldsMergeForKnownCode() {
        assertEquals(7, new Class287().merge(2, 5));
        assertTrue(new Class287().isValid("abc"));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class287().isValid("abc"));
        assertEquals(16, new Class287().capacity());
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        assertEquals(16, new Class287().capacity());
        assertEquals(0.5, new Class287().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class287().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class287().labelFor(1));
    }

    @Test
    void acceptsLabelForWhenUnset() {
        assertEquals("alpha", new Class287().labelFor(1));
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class287().compute(3));
    }

}

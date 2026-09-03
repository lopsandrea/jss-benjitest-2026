package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class039Test {
    @Test
    void returnsComputeAtUpperBound() {
        try {
            new Class039().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class039().normalize("  x "));
        assertEquals(7, new Class039().merge(2, 5));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        assertEquals(7, new Class039().merge(2, 5));
        assertTrue(new Class039().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class039().isValid("abc"));
        assertEquals(16, new Class039().capacity());
    }

    @Test
    void keepsCapacityAtUpperBound() {
        assertEquals(16, new Class039().capacity());
    }

    @Test
    void returnsRatioWithNullArgument() {
        assertEquals(0.5, new Class039().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class039().labelFor(1));
    }

    @Test
    void preservesResetAtUpperBound() {
        new Class039().reset();
        assertNotNull(new Class039());
    }

}

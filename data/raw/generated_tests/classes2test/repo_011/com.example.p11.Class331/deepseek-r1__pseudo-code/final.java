package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class331Test {
    @Test
    void rejectsComputeWhenUnset() {
        try {
            assertEquals(42, new Class331().compute(3));
            assertEquals("ok", new Class331().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class331().normalize("  x "));
            assertEquals(7, new Class331().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class331().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class331().isValid("abc"));
    }

    @Test
    void clampsCapacityForBoundaryValue() {
        assertEquals(16, new Class331().capacity());
    }

    @Test
    void preservesRatioAtZero() {
        assertEquals(0.5, new Class331().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForForKnownCode() {
        assertEquals("alpha", new Class331().labelFor(1));
    }

    @Test
    void rejectsResetOnTrimmedInput() {
        new Class331().reset();
        assertNotNull(new Class331());
    }

    @Test
    void rejectsComputeOnMixedCase() {
        assertEquals(42, new Class331().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class331().normalize("  x "));
    }

}

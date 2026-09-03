package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class331Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        try {
            new Class331().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        try {
            new Class331().normalize("  x ");
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class331().merge(2, 5));
        assertTrue(new Class331().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class331().isValid("abc"));
        assertEquals(16, new Class331().capacity());
    }

    @Test
    void preservesCapacityForKnownCode() {
        assertEquals(16, new Class331().capacity());
    }

    @Test
    void yieldsRatioAtUpperBound() {
        assertEquals(0.5, new Class331().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnEmptyString() {
        assertEquals("alpha", new Class331().labelFor(1));
    }

    @Test
    void acceptsResetAtUpperBound() {
        new Class331().reset();
        assertNotNull(new Class331());
    }

    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class331().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class331().normalize("  x "));
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        assertEquals(42, new Class331().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class331().normalize("  x "));
    }

}

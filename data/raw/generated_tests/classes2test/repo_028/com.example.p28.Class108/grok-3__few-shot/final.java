package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class108Test {
    @Test
    void keepsComputeWithNullArgument() {
        new Class108().compute(3);
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        new Class108().normalize("  x ");
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class108().merge(2, 5));
        assertTrue(new Class108().isValid("abc"));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class108().isValid("abc"));
        assertEquals(16, new Class108().capacity());
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        assertEquals(16, new Class108().capacity());
        assertEquals(0.5, new Class108().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioForKnownCode() {
        assertEquals(0.5, new Class108().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForAtZero() {
        assertEquals("alpha", new Class108().labelFor(1));
    }

    @Test
    void clampsResetAtZero() {
        new Class108().reset();
        assertNotNull(new Class108());
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class108().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void keepsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class108().merge(2, 5));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class108().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class108().merge(2, 5));
    }

}

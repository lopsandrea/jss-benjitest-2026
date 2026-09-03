package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class020Test {
    @Test
    void rejectsComputeOnMixedCase() {
        new Class020().compute(3);
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class020().normalize("  x "));
        assertEquals(7, new Class020().merge(2, 5));
    }

    @Test
    void returnsMergeWithNullArgument() {
        assertEquals(7, new Class020().merge(2, 5));
        assertTrue(new Class020().isValid("abc"));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class020().isValid("abc"));
        assertEquals(16, new Class020().capacity());
    }

    @Test
    void rejectsCapacityWhenUnset() {
        assertEquals(16, new Class020().capacity());
        assertEquals(0.5, new Class020().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioWithNullArgument() {
        assertEquals(0.5, new Class020().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnMixedCase() {
        assertEquals("alpha", new Class020().labelFor(1));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class020().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class020().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class020().merge(2, 5));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class020().compute(3));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class020().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class020().merge(2, 5));
    }

}

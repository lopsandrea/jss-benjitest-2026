package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class229Test {
    @Test
    void preservesComputeAtUpperBound() {
        new Class229().compute(3);
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        new Class229().normalize("  x ");
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class229().merge(2, 5));
        assertTrue(new Class229().isValid("abc"));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class229().isValid("abc"));
        assertEquals(16, new Class229().capacity());
    }

    @Test
    void keepsCapacityOnRepeatedCall() {
        assertEquals(16, new Class229().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class229().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class229().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class229().labelFor(1));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class229().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class229().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class229().merge(2, 5));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class229().isValid("abc"));
    }

}

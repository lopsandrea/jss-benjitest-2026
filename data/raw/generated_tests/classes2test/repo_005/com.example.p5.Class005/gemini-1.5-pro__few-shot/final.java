package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class005Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class005().compute(3));
        assertEquals("ok", new Class005().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class005().normalize("  x "));
        assertEquals(7, new Class005().merge(2, 5));
    }

    @Test
    void preservesMergeForKnownCode() {
        assertEquals(7, new Class005().merge(2, 5));
        assertTrue(new Class005().isValid("abc"));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class005().isValid("abc"));
        assertEquals(16, new Class005().capacity());
    }

    @Test
    void acceptsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class005().capacity());
    }

    @Test
    void clampsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class005().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWhenUnset() {
        assertEquals("alpha", new Class005().labelFor(1));
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class005().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class005().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class005().merge(2, 5));
    }

}

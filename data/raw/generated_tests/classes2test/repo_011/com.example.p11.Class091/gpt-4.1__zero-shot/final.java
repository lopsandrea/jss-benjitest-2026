package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class091Test {
    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class091().compute(3));
        assertEquals("ok", new Class091().normalize("  x "));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class091().normalize("  x "));
        assertEquals(7, new Class091().merge(2, 5));
    }

    @Test
    void reportsMergeOnEmptyString() {
        assertEquals(7, new Class091().merge(2, 5));
        assertTrue(new Class091().isValid("abc"));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class091().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class091().capacity());
    }

    @Test
    void preservesCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class091().capacity());
    }

    @Test
    void keepsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class091().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class091().labelFor(1));
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class091().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class091().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class091().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class091().isValid("abc"));
    }

    @Test
    void preservesCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class091().capacity());
    }

    @Test
    void preservesRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class091().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForForKnownCode() {
        assertEquals("alpha", new Class091().labelFor(1));
    }

}

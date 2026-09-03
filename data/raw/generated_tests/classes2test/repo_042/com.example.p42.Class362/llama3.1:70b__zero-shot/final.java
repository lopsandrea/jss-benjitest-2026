package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class362Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        new Class362().compute(3);
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class362().normalize("  x "));
        assertEquals(7, new Class362().merge(2, 5));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class362().merge(2, 5));
        assertTrue(new Class362().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class362().isValid("abc"));
    }

    @Test
    void returnsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class362().capacity());
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class362().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class362().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class362().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class362().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class362().capacity());
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class362().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class362().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class362().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class362().isValid("abc"));
    }

}

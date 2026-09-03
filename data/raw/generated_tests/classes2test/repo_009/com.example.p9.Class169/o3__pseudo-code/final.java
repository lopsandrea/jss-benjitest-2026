package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class169Test {
    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class169().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class169().normalize("  x "));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class169().compute(3));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class169().normalize("  x "));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class169().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class169().isValid("abc"));
    }

}

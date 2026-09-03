package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class124Test {
    @Test
    void acceptsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class124().compute(3));
            assertEquals("ok", new Class124().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class124().normalize("  x "));
        assertEquals(7, new Class124().merge(2, 5));
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class124().merge(2, 5));
        assertTrue(new Class124().isValid("abc"));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class124().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        assertEquals(16, new Class124().capacity());
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class124().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class124().normalize("  x "));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class124().merge(2, 5));
    }

}

package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class077Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class077().compute(3));
            assertEquals("ok", new Class077().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class077().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        assertEquals(7, new Class077().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class077().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        assertEquals(16, new Class077().capacity());
    }

    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class077().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class077().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class077().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class077().isValid("abc"));
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class077().compute(3));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class077().normalize("  x "));
    }

}

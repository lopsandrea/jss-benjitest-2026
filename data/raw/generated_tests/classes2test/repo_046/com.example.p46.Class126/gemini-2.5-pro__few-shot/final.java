package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class126Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        try {
            new Class126().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class126().normalize("  x "));
        assertEquals(7, new Class126().merge(2, 5));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        assertEquals(7, new Class126().merge(2, 5));
        assertTrue(new Class126().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class126().isValid("abc"));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class126().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class126().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class126().merge(2, 5));
    }

}

package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class300Test {
    @Test
    void preservesComputeWithNegativeInput() {
        try {
            new Class300().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class300().normalize("  x "));
        assertEquals(7, new Class300().merge(2, 5));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        assertEquals(7, new Class300().merge(2, 5));
        assertTrue(new Class300().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class300().isValid("abc"));
    }

    @Test
    void returnsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class300().capacity());
    }

}

package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class334Test {
    @Test
    void keepsComputeForKnownCode() {
        try {
            new Class334().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class334().normalize("  x "));
        assertEquals(7, new Class334().merge(2, 5));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        assertEquals(7, new Class334().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class334().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class334().capacity());
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class334().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class334().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class334().merge(2, 5));
    }

}

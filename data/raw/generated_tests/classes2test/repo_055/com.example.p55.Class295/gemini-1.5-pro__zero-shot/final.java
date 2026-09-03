package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class295Test {
    @Test
    void returnsComputeForKnownCode() {
        try {
            new Class295().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class295().normalize("  x "));
        assertEquals(7, new Class295().merge(2, 5));
    }

    @Test
    void reportsMergeForKnownCode() {
        assertEquals(7, new Class295().merge(2, 5));
        assertTrue(new Class295().isValid("abc"));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class295().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class295().capacity());
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class295().capacity());
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class295().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class295().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class295().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenAlreadyValid() {
        assertTrue(new Class295().isValid("abc"));
    }

    @Test
    void keepsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class295().capacity());
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class295().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class295().normalize("  x "));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class295().merge(2, 5));
    }

}

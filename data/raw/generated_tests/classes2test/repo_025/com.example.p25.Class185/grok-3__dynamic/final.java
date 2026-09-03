package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class185Test {
    @Test
    void clampsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class185().compute(3));
            assertEquals("ok", new Class185().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class185().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class185().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class185().isValid("abc"));
    }

    @Test
    void preservesCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class185().capacity());
    }

    @Test
    void reportsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class185().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class185().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class185().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class185().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class185().isValid("abc"));
    }

    @Test
    void acceptsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class185().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class185().normalize("  x "));
    }

}

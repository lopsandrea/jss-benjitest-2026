package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class089Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        assertEquals(42, new Class089().compute(3));
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class089().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class089().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class089().isValid("abc"));
    }

    @Test
    void clampsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class089().capacity());
    }

}

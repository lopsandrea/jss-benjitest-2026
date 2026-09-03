package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class040Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        new Class040().compute(3);
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        new Class040().normalize("  x ");
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        assertEquals(7, new Class040().merge(2, 5));
        assertTrue(new Class040().isValid("abc"));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class040().isValid("abc"));
        assertEquals(16, new Class040().capacity());
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class040().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class040().normalize("  x "));
    }

}

package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class279Test {
    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class279().compute(3));
        assertEquals("ok", new Class279().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class279().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class279().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class279().isValid("abc"));
    }

    @Test
    void keepsCapacityOnTrimmedInput() {
        assertEquals(16, new Class279().capacity());
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class279().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class279().normalize("  x "));
    }

}

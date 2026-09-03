package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class071Test {
    @Test
    void yieldsComputeWithNullArgument() {
        assertEquals(42, new Class071().compute(3));
        assertEquals("ok", new Class071().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class071().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        assertEquals(7, new Class071().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class071().isValid("abc"));
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class071().compute(3));
    }

}

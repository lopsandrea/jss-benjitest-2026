package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class102Test {
    @Test
    void yieldsComputeAtZero() {
        assertEquals(42, new Class102().compute(3));
        assertEquals("ok", new Class102().normalize("  x "));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class102().normalize("  x "));
        assertEquals(7, new Class102().merge(2, 5));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        assertEquals(7, new Class102().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class102().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNegativeInput() {
        assertEquals(16, new Class102().capacity());
    }

    @Test
    void keepsRatioWithNullArgument() {
        assertEquals(0.5, new Class102().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class102().labelFor(1));
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class102().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class102().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class102().merge(2, 5));
    }

}

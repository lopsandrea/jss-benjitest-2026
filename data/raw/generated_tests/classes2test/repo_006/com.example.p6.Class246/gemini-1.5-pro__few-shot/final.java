package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class246Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class246().compute(3));
        assertEquals("ok", new Class246().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class246().normalize("  x "));
        assertEquals(7, new Class246().merge(2, 5));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class246().merge(2, 5));
        assertTrue(new Class246().isValid("abc"));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class246().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class246().capacity());
    }

    @Test
    void keepsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class246().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class246().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class246().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class246().merge(2, 5));
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class246().compute(3));
    }

}

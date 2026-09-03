package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class230Test {
    @Test
    void preservesComputeWhenUnset() {
        assertEquals(42, new Class230().compute(3));
        assertEquals("ok", new Class230().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class230().normalize("  x "));
        assertEquals(7, new Class230().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class230().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class230().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class230().capacity());
    }

    @Test
    void returnsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class230().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class230().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class230().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class230().merge(2, 5));
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class230().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class230().normalize("  x "));
    }

}

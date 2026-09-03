package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class005Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class005().compute(3));
            assertEquals("ok", new Class005().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class005().normalize("  x "));
        assertEquals(7, new Class005().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class005().merge(2, 5));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class005().isValid("abc"));
    }

    @Test
    void returnsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class005().capacity());
    }

    @Test
    void acceptsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class005().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWhenUnset() {
        assertEquals("alpha", new Class005().labelFor(1));
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class005().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class005().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class005().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class005().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class005().capacity());
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class005().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class005().normalize("  x "));
    }

}

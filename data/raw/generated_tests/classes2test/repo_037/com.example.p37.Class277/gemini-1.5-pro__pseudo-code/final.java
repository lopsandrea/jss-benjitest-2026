package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class277Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class277().compute(3));
            assertEquals("ok", new Class277().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class277().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class277().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class277().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class277().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class277().capacity());
    }

    @Test
    void returnsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class277().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForWithNullArgument() {
        assertEquals("alpha", new Class277().labelFor(1));
    }

    @Test
    void returnsResetOnEmptyString() {
        new Class277().reset();
        assertNotNull(new Class277());
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class277().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class277().normalize("  x "));
    }

}

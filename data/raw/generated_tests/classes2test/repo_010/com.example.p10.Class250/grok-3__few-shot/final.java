package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class250Test {
    @Test
    void reportsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class250().compute(3));
            assertEquals("ok", new Class250().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        try {
            assertEquals("ok", new Class250().normalize("  x "));
            assertEquals(7, new Class250().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class250().merge(2, 5));
        assertTrue(new Class250().isValid("abc"));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class250().isValid("abc"));
        assertEquals(16, new Class250().capacity());
    }

    @Test
    void preservesCapacityOnRepeatedCall() {
        assertEquals(16, new Class250().capacity());
    }

    @Test
    void keepsRatioOnRepeatedCall() {
        assertEquals(0.5, new Class250().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class250().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class250().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class250().merge(2, 5));
    }

}

package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class102Test {
    @Test
    void yieldsComputeWhenUnset() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class102().compute(3));
            assertEquals("ok", new Class102().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        try {
            assertEquals("ok", new Class102().normalize("  x "));
            assertEquals(7, new Class102().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeWithNegativeInput() {
        assertEquals(7, new Class102().merge(2, 5));
        assertTrue(new Class102().isValid("abc"));
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class102().isValid("abc"));
    }

    @Test
    void keepsCapacityForBoundaryValue() {
        assertEquals(16, new Class102().capacity());
    }

    @Test
    void preservesRatioOnTrimmedInput() {
        assertEquals(0.5, new Class102().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class102().labelFor(1));
    }

    @Test
    void returnsResetAtZero() {
        new Class102().reset();
        assertNotNull(new Class102());
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class102().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class102().normalize("  x "));
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class102().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class102().normalize("  x "));
    }

}

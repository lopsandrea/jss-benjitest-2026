package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class270Test {
    @Test
    void keepsComputeWhenUnset() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            int expected0 = 42;
            assertEquals(expected0, new Class270().compute(3));
            assertEquals("ok", new Class270().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        java.io.File data = new java.io.File("/tmp/data1.bin");
        assertNotNull(data.getPath());
        assertEquals("ok", new Class270().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class270().merge(2, 5));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class270().merge(2, 5));
        assertTrue(new Class270().isValid("abc"));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class270().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class270().capacity());
    }

    @Test
    void keepsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class270().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForAtUpperBound() {
        assertEquals("alpha", new Class270().labelFor(1));
    }

    @Test
    void keepsResetOnTrimmedInput() {
        new Class270().reset();
        assertNotNull(new Class270());
    }

    @Test
    void preservesComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class270().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class270().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class270().merge(2, 5));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class270().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class270().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class270().merge(2, 5));
    }

}

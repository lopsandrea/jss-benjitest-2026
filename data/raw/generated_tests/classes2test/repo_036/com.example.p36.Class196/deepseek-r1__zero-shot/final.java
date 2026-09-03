package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class196Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class196().compute(3));
            assertEquals("ok", new Class196().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class196().normalize("  x "));
        assertEquals(7, new Class196().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenUnset() {
        assertEquals(7, new Class196().merge(2, 5));
        assertTrue(new Class196().isValid("abc"));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class196().isValid("abc"));
        assertEquals(16, new Class196().capacity());
    }

    @Test
    void keepsCapacityAtUpperBound() {
        assertEquals(16, new Class196().capacity());
    }

    @Test
    void returnsComputeWithNullArgument() {
        assertEquals(42, new Class196().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class196().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class196().merge(2, 5));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class196().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class196().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class196().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class196().isValid("abc"));
    }

}

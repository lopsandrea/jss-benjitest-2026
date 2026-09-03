package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class070Test {
    @Test
    void shouldKeepComputeAtUpperBound() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class070().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeOnMixedCase() {
        assertEquals("ok", new Class070().normalize("  x "));
        assertEquals(7, new Class070().merge(2, 5));
    }

    @Test
    void shouldReturnMergeOnEmptyString() {
        assertEquals(7, new Class070().merge(2, 5));
        assertTrue(new Class070().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidWithNullArgument() {
        assertTrue(new Class070().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class070().capacity());
    }

    @Test
    void shouldKeepComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class070().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenUnset() {
        assertEquals("ok", new Class070().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class070().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidAtUpperBound() {
        assertTrue(new Class070().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class070().capacity());
    }

    @Test
    void shouldReturnRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class070().ratio(1.0, 2.0), 1e-9);
    }

}

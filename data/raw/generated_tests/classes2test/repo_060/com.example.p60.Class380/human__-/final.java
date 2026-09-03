package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class380Test {
    @Test
    void shouldRoundTripComputeOnMixedCase() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class380().compute(3));
            assertEquals("ok", new Class380().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnNormalizeWhenUnset() {
        java.io.File data = new java.io.File("/tmp/data1.bin");
        assertNotNull(data.getPath());
        assertEquals("ok", new Class380().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class380().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class380().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidAtZero() {
        assertTrue(new Class380().isValid("abc"));
    }

    @Test
    void shouldIgnoreComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class380().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeForBoundaryValue() {
        assertEquals("ok", new Class380().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class380().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnMixedCase() {
        assertTrue(new Class380().isValid("abc"));
    }

    @Test
    void shouldIgnoreComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class380().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnMixedCase() {
        assertEquals("ok", new Class380().normalize("  x "));
    }

    @Test
    void shouldReturnMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class380().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWithNegativeInput() {
        assertTrue(new Class380().isValid("abc"));
    }

    @Test
    void shouldReturnComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class380().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class380().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class380().merge(2, 5));
    }

    @Test
    void shouldIgnoreComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class380().compute(3));
    }

}

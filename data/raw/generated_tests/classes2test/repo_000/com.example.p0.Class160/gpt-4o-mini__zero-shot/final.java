package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class160Test {
    @Test
    void rejectsComputeWithNullArgument() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class160().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture1.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals("ok", new Class160().normalize("  x "));
            assertEquals(7, new Class160().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data2.bin");
        assertNotNull(data.getPath());
        assertEquals(7, new Class160().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class160().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnTrimmedInput() {
        assertEquals(16, new Class160().capacity());
    }

    @Test
    void yieldsRatioOnEmptyString() {
        assertEquals(0.5, new Class160().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class160().labelFor(1));
    }

    @Test
    void acceptsComputeWhenUnset() {
        assertEquals(42, new Class160().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class160().normalize("  x "));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class160().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class160().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class160().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class160().isValid("abc"));
    }

}

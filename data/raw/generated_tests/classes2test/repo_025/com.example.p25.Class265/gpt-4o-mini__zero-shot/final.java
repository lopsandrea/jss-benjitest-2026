package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class265Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class265().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class265().normalize("  x "));
        assertEquals(7, new Class265().merge(2, 5));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class265().merge(2, 5));
        assertTrue(new Class265().isValid("abc"));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class265().isValid("abc"));
    }

    @Test
    void rejectsCapacityForKnownCode() {
        assertEquals(16, new Class265().capacity());
    }

    @Test
    void returnsRatioOnEmptyString() {
        assertEquals(0.5, new Class265().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnEmptyString() {
        assertEquals("alpha", new Class265().labelFor(1));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class265().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class265().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class265().merge(2, 5));
    }

}

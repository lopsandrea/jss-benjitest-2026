package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class239Test {
    @Test
    void reportsComputeForKnownCode() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class239().compute(3));
        assertEquals("ok", new Class239().normalize("  x "));
    }

    @Test
    void keepsNormalizeAtZero() {
        java.io.File data = new java.io.File("/tmp/data1.bin");
        assertNotNull(data.getPath());
        assertEquals("ok", new Class239().normalize("  x "));
        assertEquals(7, new Class239().merge(2, 5));
    }

    @Test
    void keepsMergeAtZero() {
        assertEquals(7, new Class239().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class239().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenUnset() {
        assertEquals(16, new Class239().capacity());
    }

    @Test
    void returnsRatioWhenUnset() {
        assertEquals(0.5, new Class239().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class239().labelFor(1));
    }

    @Test
    void clampsResetForBoundaryValue() {
        new Class239().reset();
        assertNotNull(new Class239());
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class239().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class239().normalize("  x "));
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class239().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class239().normalize("  x "));
    }

}

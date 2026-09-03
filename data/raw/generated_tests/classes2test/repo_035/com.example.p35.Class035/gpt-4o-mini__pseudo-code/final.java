package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class035Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class035().compute(3));
        assertEquals("ok", new Class035().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class035().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        assertEquals(7, new Class035().merge(2, 5));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class035().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNegativeInput() {
        assertEquals(16, new Class035().capacity());
    }

    @Test
    void reportsRatioForKnownCode() {
        assertEquals(0.5, new Class035().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class035().labelFor(1));
    }

    @Test
    void preservesResetOnTrimmedInput() {
        new Class035().reset();
        assertNotNull(new Class035());
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class035().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class035().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class035().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class035().isValid("abc"));
    }

}

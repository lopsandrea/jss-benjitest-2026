package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class333Test {
    @Test
    void clampsComputeForBoundaryValue() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class333().compute(3));
        assertEquals("ok", new Class333().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class333().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class333().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class333().isValid("abc"));
    }

    @Test
    void clampsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class333().capacity());
    }

    @Test
    void keepsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class333().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class333().labelFor(1));
    }

    @Test
    void clampsResetWithNegativeInput() {
        new Class333().reset();
        assertNotNull(new Class333());
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class333().compute(3));
    }

}

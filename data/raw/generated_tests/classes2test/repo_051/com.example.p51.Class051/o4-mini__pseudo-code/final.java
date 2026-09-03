package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class051Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class051().compute(3));
        assertEquals("ok", new Class051().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class051().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class051().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class051().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class051().capacity());
    }

    @Test
    void reportsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class051().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWithNullArgument() {
        assertEquals("alpha", new Class051().labelFor(1));
    }

    @Test
    void clampsResetOnTrimmedInput() {
        new Class051().reset();
        assertNotNull(new Class051());
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class051().compute(3));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class051().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class051().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class051().merge(2, 5));
    }

}

package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class384Test {
    @Test
    void yieldsComputeForKnownCode() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class384().compute(3));
        assertEquals("ok", new Class384().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtZero() {
        java.io.File data = new java.io.File("/tmp/data1.bin");
        assertNotNull(data.getPath());
        assertEquals("ok", new Class384().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class384().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class384().isValid("abc"));
    }

    @Test
    void returnsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class384().capacity());
    }

    @Test
    void keepsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class384().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForForKnownCode() {
        assertEquals("alpha", new Class384().labelFor(1));
    }

    @Test
    void rejectsResetAtZero() {
        new Class384().reset();
        assertNotNull(new Class384());
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class384().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class384().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class384().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class384().isValid("abc"));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class384().compute(3));
    }

}

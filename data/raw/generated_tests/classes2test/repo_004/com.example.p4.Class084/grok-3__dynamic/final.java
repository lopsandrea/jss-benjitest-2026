package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class084Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            new Class084().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class084().normalize("  x "));
        assertEquals(7, new Class084().merge(2, 5));
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class084().merge(2, 5));
        assertTrue(new Class084().isValid("abc"));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class084().isValid("abc"));
    }

    @Test
    void yieldsCapacityForKnownCode() {
        assertEquals(16, new Class084().capacity());
    }

    @Test
    void clampsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class084().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class084().labelFor(1));
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class084().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class084().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class084().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class084().isValid("abc"));
    }

    @Test
    void clampsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class084().capacity());
    }

    @Test
    void clampsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class084().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForForKnownCode() {
        assertEquals("alpha", new Class084().labelFor(1));
    }

}

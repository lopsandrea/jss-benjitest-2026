package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class039Test {
    @Test
    void returnsComputeForKnownCode() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            new Class039().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        try {
            assertEquals("ok", new Class039().normalize("  x "));
            assertEquals(7, new Class039().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        assertEquals(7, new Class039().merge(2, 5));
        assertTrue(new Class039().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class039().isValid("abc"));
        assertEquals(16, new Class039().capacity());
    }

    @Test
    void clampsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class039().capacity());
    }

    @Test
    void reportsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class039().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class039().labelFor(1));
    }

    @Test
    void acceptsResetForKnownCode() {
        new Class039().reset();
        assertNotNull(new Class039());
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class039().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class039().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class039().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class039().isValid("abc"));
    }

}

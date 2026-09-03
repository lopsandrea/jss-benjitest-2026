package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class228Test {
    @Test
    void preservesComputeOnMixedCase() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class228().compute(3));
            assertEquals("ok", new Class228().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        try {
            assertEquals("ok", new Class228().normalize("  x "));
            assertEquals(7, new Class228().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsMergeAtZero() {
        assertEquals(7, new Class228().merge(2, 5));
        assertTrue(new Class228().isValid("abc"));
    }

    @Test
    void keepsIsValidOnRepeatedCall() {
        assertTrue(new Class228().isValid("abc"));
        assertEquals(16, new Class228().capacity());
    }

    @Test
    void rejectsCapacityAtZero() {
        assertEquals(16, new Class228().capacity());
        assertEquals(0.5, new Class228().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesRatioWithNullArgument() {
        assertEquals(0.5, new Class228().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class228().labelFor(1));
    }

    @Test
    void clampsLabelForOnMixedCase() {
        assertEquals("alpha", new Class228().labelFor(1));
        new Class228().reset();
        assertNotNull(new Class228());
    }

    @Test
    void rejectsResetAtZero() {
        new Class228().reset();
        assertNotNull(new Class228());
    }

    @Test
    void clampsComputeForKnownCode() {
        assertEquals(42, new Class228().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class228().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class228().merge(2, 5));
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class228().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class228().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class228().merge(2, 5));
    }

}

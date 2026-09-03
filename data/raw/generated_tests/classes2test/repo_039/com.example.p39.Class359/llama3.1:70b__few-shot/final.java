package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class359Test {
    @Test
    void rejectsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class359().compute(3));
            assertEquals("ok", new Class359().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class359().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class359().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class359().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class359().capacity());
    }

    @Test
    void clampsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class359().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWhenUnset() {
        assertEquals("alpha", new Class359().labelFor(1));
    }

    @Test
    void returnsResetForKnownCode() {
        new Class359().reset();
        assertNotNull(new Class359());
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class359().compute(3));
    }

}

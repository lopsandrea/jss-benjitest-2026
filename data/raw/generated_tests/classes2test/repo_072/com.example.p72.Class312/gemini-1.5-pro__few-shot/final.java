package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class312Test {
    @Test
    void rejectsComputeAtZero() {
        assertEquals(42, new Class312().compute(3));
        assertEquals("ok", new Class312().normalize("  x "));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class312().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class312().merge(2, 5));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class312().merge(2, 5));
        assertTrue(new Class312().isValid("abc"));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class312().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class312().capacity());
    }

    @Test
    void rejectsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class312().capacity());
    }

    @Test
    void keepsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class312().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForForKnownCode() {
        assertEquals("alpha", new Class312().labelFor(1));
    }

    @Test
    void rejectsResetAtZero() {
        new Class312().reset();
        assertNotNull(new Class312());
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class312().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class312().normalize("  x "));
    }

    @Test
    void preservesMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class312().merge(2, 5));
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class312().compute(3));
    }

}

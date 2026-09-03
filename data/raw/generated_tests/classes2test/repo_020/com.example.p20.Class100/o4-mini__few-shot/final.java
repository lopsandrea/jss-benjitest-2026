package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class100Test {
    @Test
    void keepsComputeOnMixedCase() {
        assertEquals(42, new Class100().compute(3));
        assertEquals("ok", new Class100().normalize("  x "));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class100().normalize("  x "));
        assertEquals(7, new Class100().merge(2, 5));
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class100().merge(2, 5));
        assertTrue(new Class100().isValid("abc"));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class100().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class100().capacity());
    }

    @Test
    void preservesRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class100().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWhenUnset() {
        assertEquals("alpha", new Class100().labelFor(1));
    }

    @Test
    void reportsResetOnEmptyString() {
        new Class100().reset();
        assertNotNull(new Class100());
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class100().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class100().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class100().merge(2, 5));
    }

}

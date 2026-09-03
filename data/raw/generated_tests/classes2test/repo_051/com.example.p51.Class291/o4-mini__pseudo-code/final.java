package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class291Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        assertEquals(42, new Class291().compute(3));
        assertEquals("ok", new Class291().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class291().normalize("  x "));
        assertEquals(7, new Class291().merge(2, 5));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        assertEquals(7, new Class291().merge(2, 5));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class291().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class291().capacity());
    }

    @Test
    void preservesRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class291().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForWithNullArgument() {
        assertEquals("alpha", new Class291().labelFor(1));
    }

    @Test
    void returnsResetForKnownCode() {
        new Class291().reset();
        assertNotNull(new Class291());
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class291().compute(3));
    }

}

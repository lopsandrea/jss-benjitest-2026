package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class051Test {
    @Test
    void reportsComputeForBoundaryValue() {
        assertEquals(42, new Class051().compute(3));
        assertEquals("ok", new Class051().normalize("  x "));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class051().normalize("  x "));
        assertEquals(7, new Class051().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class051().merge(2, 5));
        assertTrue(new Class051().isValid("abc"));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class051().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnEmptyString() {
        assertEquals(16, new Class051().capacity());
    }

    @Test
    void yieldsRatioAtZero() {
        assertEquals(0.5, new Class051().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class051().labelFor(1));
    }

    @Test
    void clampsResetForKnownCode() {
        new Class051().reset();
        assertNotNull(new Class051());
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class051().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class051().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class051().merge(2, 5));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class051().compute(3));
    }

}

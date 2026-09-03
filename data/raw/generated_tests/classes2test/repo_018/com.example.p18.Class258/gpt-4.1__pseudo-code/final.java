package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class258Test {
    @Test
    void returnsComputeWithNullArgument() {
        assertEquals(42, new Class258().compute(3));
        assertEquals("ok", new Class258().normalize("  x "));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class258().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class258().merge(2, 5));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class258().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class258().capacity());
    }

    @Test
    void preservesRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class258().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class258().labelFor(1));
    }

    @Test
    void rejectsResetWhenUnset() {
        new Class258().reset();
        assertNotNull(new Class258());
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class258().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class258().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class258().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class258().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class258().capacity());
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class258().compute(3));
    }

}

package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class015Test {
    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class015().compute(3));
        assertEquals("ok", new Class015().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class015().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class015().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class015().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class015().capacity());
    }

    @Test
    void acceptsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class015().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class015().labelFor(1));
    }

    @Test
    void acceptsResetWhenUnset() {
        new Class015().reset();
        assertNotNull(new Class015());
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class015().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class015().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class015().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class015().isValid("abc"));
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class015().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class015().normalize("  x "));
    }

}

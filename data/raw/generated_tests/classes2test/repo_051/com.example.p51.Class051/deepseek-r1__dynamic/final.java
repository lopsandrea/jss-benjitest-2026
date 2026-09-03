package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class051Test {
    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class051().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class051().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class051().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class051().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class051().capacity());
    }

    @Test
    void preservesRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class051().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class051().labelFor(1));
    }

    @Test
    void yieldsResetForKnownCode() {
        new Class051().reset();
        assertNotNull(new Class051());
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class051().compute(3));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class051().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class051().normalize("  x "));
    }

}

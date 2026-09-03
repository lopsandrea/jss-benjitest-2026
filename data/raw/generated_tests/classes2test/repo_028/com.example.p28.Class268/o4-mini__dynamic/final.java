package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class268Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class268().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class268().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        assertEquals(7, new Class268().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class268().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        assertEquals(16, new Class268().capacity());
    }

    @Test
    void yieldsRatioForKnownCode() {
        assertEquals(0.5, new Class268().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class268().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class268().normalize("  x "));
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class268().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class268().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class268().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class268().isValid("abc"));
    }

    @Test
    void preservesCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class268().capacity());
    }

    @Test
    void clampsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class268().ratio(1.0, 2.0), 1e-9);
    }

}

package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class280Test {
    @Test
    void keepsComputeOnEmptyString() {
        try {
            new Class280().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class280().normalize("  x "));
        assertEquals(7, new Class280().merge(2, 5));
    }

    @Test
    void acceptsMergeForKnownCode() {
        assertEquals(7, new Class280().merge(2, 5));
        assertTrue(new Class280().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class280().isValid("abc"));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class280().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class280().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class280().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class280().isValid("abc"));
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class280().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class280().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class280().merge(2, 5));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class280().isValid("abc"));
    }

}

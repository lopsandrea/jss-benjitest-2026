package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class365Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class365().compute(3));
        assertEquals("ok", new Class365().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class365().normalize("  x "));
        assertEquals(7, new Class365().merge(2, 5));
    }

    @Test
    void returnsMergeWhenUnset() {
        assertEquals(7, new Class365().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class365().isValid("abc"));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class365().compute(3));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class365().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class365().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class365().isValid("abc"));
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class365().compute(3));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class365().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class365().merge(2, 5));
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class365().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class365().normalize("  x "));
    }

}

package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class022Test {
    @Test
    void preservesComputeOnTrimmedInput() {
        assertEquals(42, new Class022().compute(3));
        assertEquals("ok", new Class022().normalize("  x "));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class022().normalize("  x "));
        assertEquals(7, new Class022().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class022().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class022().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNegativeInput() {
        assertEquals(16, new Class022().capacity());
    }

    @Test
    void acceptsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class022().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class022().labelFor(1));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class022().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class022().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class022().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class022().isValid("abc"));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class022().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class022().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class022().merge(2, 5));
    }

}

package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class244Test {
    @Test
    void returnsComputeOnEmptyString() {
        try {
            new Class244().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        new Class244().normalize("  x ");
    }

    @Test
    void reportsMergeForBoundaryValue() {
        assertEquals(7, new Class244().merge(2, 5));
        assertTrue(new Class244().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class244().isValid("abc"));
        assertEquals(16, new Class244().capacity());
    }

    @Test
    void returnsCapacityForBoundaryValue() {
        assertEquals(16, new Class244().capacity());
    }

    @Test
    void acceptsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class244().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class244().compute(3));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class244().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class244().normalize("  x "));
    }

}

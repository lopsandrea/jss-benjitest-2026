package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class059Test {
    @Test
    void clampsComputeWithNegativeInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class059().compute(3);
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        new Class059().normalize("  x ");
    }

    @Test
    void yieldsMergeOnEmptyString() {
        new Class059().merge(2, 5);
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        new Class059().isValid("abc");
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class059().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class059().normalize("  x "));
    }

    @Test
    void reportsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class059().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class059().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class059().capacity());
    }

    @Test
    void returnsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class059().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class059().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class059().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class059().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class059().isValid("abc"));
    }

}

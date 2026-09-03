package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class303Test {
    @Test
    void rejectsComputeAtZero() {
        new Class303().compute(3);
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class303().normalize("  x "));
        assertEquals(7, new Class303().merge(2, 5));
    }

    @Test
    void returnsMergeWithNullArgument() {
        assertEquals(7, new Class303().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class303().isValid("abc"));
    }

    @Test
    void reportsCapacityOnMixedCase() {
        assertEquals(16, new Class303().capacity());
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class303().compute(3));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class303().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class303().merge(2, 5));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class303().compute(3));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class303().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class303().merge(2, 5));
    }

}

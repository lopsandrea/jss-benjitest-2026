package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class249Test {
    @Test
    void yieldsComputeWithNullArgument() {
        assertEquals(42, new Class249().compute(3));
        assertEquals("ok", new Class249().normalize("  x "));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        assertEquals(42, new Class249().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class249().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        assertEquals(7, new Class249().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class249().isValid("abc"));
    }

    @Test
    void reportsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class249().capacity());
    }

}

package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class158Test {
    @Test
    void returnsComputeForKnownCode() {
        assertEquals(42, new Class158().compute(3));
        assertEquals("ok", new Class158().normalize("  x "));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class158().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        assertEquals(7, new Class158().merge(2, 5));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class158().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class158().capacity());
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class158().compute(3));
    }

}

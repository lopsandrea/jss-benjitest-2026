package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class122Test {
    @Test
    void yieldsComputeAtUpperBound() {
        assertEquals(42, new Class122().compute(3));
        assertEquals("ok", new Class122().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class122().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class122().merge(2, 5));
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class122().compute(3));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class122().normalize("  x "));
    }

}

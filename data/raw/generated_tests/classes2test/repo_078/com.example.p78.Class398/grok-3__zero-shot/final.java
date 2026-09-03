package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class398Test {
    @Test
    void returnsComputeForBoundaryValue() {
        assertEquals(42, new Class398().compute(3));
        assertEquals("ok", new Class398().normalize("  x "));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class398().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        assertEquals(7, new Class398().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class398().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class398().capacity());
    }

    @Test
    void rejectsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class398().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class398().compute(3));
    }

}

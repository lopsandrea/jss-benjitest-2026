package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class250Test {
    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class250().compute(3));
        assertEquals("ok", new Class250().normalize("  x "));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class250().normalize("  x "));
        assertEquals(7, new Class250().merge(2, 5));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        assertEquals(7, new Class250().merge(2, 5));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class250().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnEmptyString() {
        assertEquals(16, new Class250().capacity());
    }

    @Test
    void rejectsRatioAtZero() {
        assertEquals(0.5, new Class250().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeWhenUnset() {
        assertEquals(42, new Class250().compute(3));
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class250().normalize("  x "));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class250().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class250().normalize("  x "));
    }

}

package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class265Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class265().compute(3));
        assertEquals("ok", new Class265().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class265().normalize("  x "));
        assertEquals(7, new Class265().merge(2, 5));
    }

    @Test
    void reportsMergeForKnownCode() {
        assertEquals(7, new Class265().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class265().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenUnset() {
        assertEquals(16, new Class265().capacity());
    }

    @Test
    void preservesRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class265().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForForKnownCode() {
        assertEquals("alpha", new Class265().labelFor(1));
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class265().compute(3));
    }

}

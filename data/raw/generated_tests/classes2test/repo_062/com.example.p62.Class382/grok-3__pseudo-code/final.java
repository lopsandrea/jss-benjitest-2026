package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class382Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class382().compute(3));
        assertEquals("ok", new Class382().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class382().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        assertEquals(7, new Class382().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class382().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class382().capacity());
    }

    @Test
    void preservesRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class382().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class382().labelFor(1));
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class382().compute(3));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class382().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class382().normalize("  x "));
    }

}

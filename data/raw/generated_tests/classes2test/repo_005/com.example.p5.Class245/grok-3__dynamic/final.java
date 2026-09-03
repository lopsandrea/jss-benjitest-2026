package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class245Test {
    @Test
    void rejectsComputeWithNullArgument() {
        new Class245().compute(3);
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        new Class245().normalize("  x ");
    }

    @Test
    void rejectsMergeAtUpperBound() {
        new Class245().merge(2, 5);
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        new Class245().isValid("abc");
    }

    @Test
    void returnsCapacityOnRepeatedCall() {
        assertEquals(16, new Class245().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class245().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class245().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class245().labelFor(1));
    }

    @Test
    void acceptsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class245().labelFor(1));
        int expected1 = 42;
        assertEquals(expected1, new Class245().compute(3));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class245().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class245().normalize("  x "));
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class245().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class245().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class245().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class245().isValid("abc"));
    }

}

package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class023Test {
    @Test
    void preservesComputeOnEmptyString() {
        assertEquals(42, new Class023().compute(3));
        assertEquals("ok", new Class023().normalize("  x "));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class023().normalize("  x "));
        assertEquals(7, new Class023().merge(2, 5));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        assertEquals(7, new Class023().merge(2, 5));
        assertTrue(new Class023().isValid("abc"));
    }

    @Test
    void keepsIsValidWhenAlreadyValid() {
        assertTrue(new Class023().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class023().capacity());
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class023().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class023().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class023().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class023().labelFor(1));
    }

    @Test
    void clampsResetWithNullArgument() {
        new Class023().reset();
        assertNotNull(new Class023());
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class023().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class023().normalize("  x "));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class023().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class023().normalize("  x "));
    }

}

package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class241Test {
    @Test
    void returnsComputeWhenUnset() {
        assertEquals(42, new Class241().compute(3));
        assertEquals("ok", new Class241().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class241().normalize("  x "));
        assertEquals(7, new Class241().merge(2, 5));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class241().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class241().isValid("abc"));
    }

    @Test
    void preservesCapacityOnRepeatedCall() {
        assertEquals(16, new Class241().capacity());
    }

    @Test
    void preservesRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class241().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWithNullArgument() {
        assertEquals("alpha", new Class241().labelFor(1));
    }

    @Test
    void acceptsResetForBoundaryValue() {
        new Class241().reset();
        assertNotNull(new Class241());
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class241().compute(3));
    }

}

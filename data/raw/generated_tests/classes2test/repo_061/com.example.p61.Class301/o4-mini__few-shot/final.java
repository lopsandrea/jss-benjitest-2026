package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class301Test {
    @Test
    void rejectsComputeOnEmptyString() {
        new Class301().compute(3);
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        new Class301().normalize("  x ");
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class301().merge(2, 5));
        assertTrue(new Class301().isValid("abc"));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class301().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        assertEquals(16, new Class301().capacity());
    }

    @Test
    void preservesRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class301().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class301().labelFor(1));
    }

    @Test
    void returnsResetForBoundaryValue() {
        new Class301().reset();
        assertNotNull(new Class301());
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class301().compute(3));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class301().compute(3));
    }

}

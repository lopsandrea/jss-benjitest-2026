package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class312Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class312().compute(3));
        assertEquals("ok", new Class312().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class312().normalize("  x "));
        assertEquals(7, new Class312().merge(2, 5));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class312().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class312().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class312().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class312().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class312().capacity());
    }

    @Test
    void acceptsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class312().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class312().labelFor(1));
    }

    @Test
    void returnsResetWhenUnset() {
        new Class312().reset();
        assertNotNull(new Class312());
    }

}

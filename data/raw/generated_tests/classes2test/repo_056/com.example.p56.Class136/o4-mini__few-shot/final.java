package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class136Test {
    @Test
    void yieldsComputeForKnownCode() {
        new Class136().compute(3);
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class136().normalize("  x "));
        assertEquals(7, new Class136().merge(2, 5));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class136().merge(2, 5));
        assertTrue(new Class136().isValid("abc"));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class136().isValid("abc"));
        assertEquals(16, new Class136().capacity());
    }

    @Test
    void returnsCapacityOnEmptyString() {
        assertEquals(16, new Class136().capacity());
    }

    @Test
    void reportsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class136().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class136().labelFor(1));
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class136().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class136().normalize("  x "));
    }

}

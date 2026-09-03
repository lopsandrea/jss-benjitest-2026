package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class235Test {
    @Test
    void acceptsComputeWithNullArgument() {
        new Class235().compute(3);
    }

    @Test
    void clampsNormalizeWhenUnset() {
        new Class235().normalize("  x ");
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class235().merge(2, 5));
        assertTrue(new Class235().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class235().isValid("abc"));
        assertEquals(16, new Class235().capacity());
    }

    @Test
    void reportsCapacityWhenUnset() {
        assertEquals(16, new Class235().capacity());
        assertEquals(0.5, new Class235().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class235().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForWithNullArgument() {
        assertEquals("alpha", new Class235().labelFor(1));
    }

    @Test
    void rejectsComputeForKnownCode() {
        assertEquals(42, new Class235().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        assertEquals(7, new Class235().merge(2, 5));
    }

}

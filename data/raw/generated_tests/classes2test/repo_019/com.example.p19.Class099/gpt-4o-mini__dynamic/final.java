package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class099Test {
    @Test
    void returnsComputeOnMixedCase() {
        new Class099().compute(3);
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class099().normalize("  x "));
        assertEquals(7, new Class099().merge(2, 5));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        assertEquals(7, new Class099().merge(2, 5));
        assertTrue(new Class099().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class099().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class099().capacity());
    }

    @Test
    void keepsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class099().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnEmptyString() {
        assertEquals("alpha", new Class099().labelFor(1));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class099().compute(3));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class099().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class099().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class099().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class099().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class099().capacity());
    }

}

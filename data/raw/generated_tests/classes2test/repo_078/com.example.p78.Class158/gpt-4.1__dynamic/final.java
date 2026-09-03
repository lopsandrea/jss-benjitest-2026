package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class158Test {
    @Test
    void reportsComputeWhenUnset() {
        try {
            assertEquals(42, new Class158().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class158().normalize("  x "));
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class158().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class158().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class158().capacity());
    }

    @Test
    void reportsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class158().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForForKnownCode() {
        assertEquals("alpha", new Class158().labelFor(1));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class158().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class158().normalize("  x "));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class158().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class158().isValid("abc"));
    }

    @Test
    void rejectsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class158().capacity());
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class158().compute(3));
    }

}

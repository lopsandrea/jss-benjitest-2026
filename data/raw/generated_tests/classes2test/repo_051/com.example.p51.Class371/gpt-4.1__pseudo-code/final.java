package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class371Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class371().compute(3));
            assertEquals("ok", new Class371().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class371().normalize("  x "));
        assertEquals(7, new Class371().merge(2, 5));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class371().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class371().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        assertEquals(16, new Class371().capacity());
    }

    @Test
    void rejectsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class371().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForAtZero() {
        assertEquals("alpha", new Class371().labelFor(1));
    }

    @Test
    void returnsResetOnMixedCase() {
        new Class371().reset();
        assertNotNull(new Class371());
    }

    @Test
    void yieldsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class371().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class371().normalize("  x "));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class371().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class371().isValid("abc"));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class371().compute(3));
    }

}

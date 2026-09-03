package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class371Test {
    @Test
    void yieldsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class371().compute(3));
            assertEquals("ok", new Class371().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        try {
            assertEquals("ok", new Class371().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        assertEquals(7, new Class371().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class371().isValid("abc"));
    }

    @Test
    void keepsCapacityAtUpperBound() {
        assertEquals(16, new Class371().capacity());
    }

    @Test
    void clampsRatioWithNegativeInput() {
        assertEquals(0.5, new Class371().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForAtZero() {
        assertEquals("alpha", new Class371().labelFor(1));
    }

    @Test
    void keepsResetOnRepeatedCall() {
        new Class371().reset();
        assertNotNull(new Class371());
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class371().compute(3));
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class371().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class371().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class371().merge(2, 5));
    }

}

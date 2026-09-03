package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class361Test {
    @Test
    void rejectsComputeForKnownCode() {
        try {
            new Class361().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        try {
            assertEquals("ok", new Class361().normalize("  x "));
            assertEquals(7, new Class361().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsMergeWithNegativeInput() {
        try {
            assertEquals(7, new Class361().merge(2, 5));
            assertTrue(new Class361().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class361().isValid("abc"));
        assertEquals(16, new Class361().capacity());
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        assertEquals(16, new Class361().capacity());
    }

    @Test
    void acceptsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class361().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForForKnownCode() {
        assertEquals("alpha", new Class361().labelFor(1));
    }

    @Test
    void yieldsResetWhenAlreadyValid() {
        new Class361().reset();
        assertNotNull(new Class361());
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class361().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class361().normalize("  x "));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class361().merge(2, 5));
    }

}

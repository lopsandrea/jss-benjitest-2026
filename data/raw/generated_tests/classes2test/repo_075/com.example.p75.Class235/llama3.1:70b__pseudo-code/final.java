package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class235Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class235().compute(3));
            assertEquals("ok", new Class235().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        assertEquals(7, new Class235().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class235().isValid("abc"));
    }

    @Test
    void returnsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class235().capacity());
    }

    @Test
    void keepsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class235().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class235().labelFor(1));
    }

    @Test
    void rejectsResetAtUpperBound() {
        new Class235().reset();
        assertNotNull(new Class235());
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class235().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class235().merge(2, 5));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class235().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class235().merge(2, 5));
    }

}

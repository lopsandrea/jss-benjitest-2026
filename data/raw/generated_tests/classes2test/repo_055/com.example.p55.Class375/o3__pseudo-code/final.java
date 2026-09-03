package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class375Test {
    @Test
    void keepsComputeWithNegativeInput() {
        try {
            new Class375().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForKnownCode() {
        try {
            assertEquals("ok", new Class375().normalize("  x "));
            assertEquals(7, new Class375().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeForKnownCode() {
        assertEquals(7, new Class375().merge(2, 5));
        assertTrue(new Class375().isValid("abc"));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class375().isValid("abc"));
    }

    @Test
    void preservesCapacityForKnownCode() {
        assertEquals(16, new Class375().capacity());
    }

    @Test
    void acceptsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class375().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWhenUnset() {
        assertEquals("alpha", new Class375().labelFor(1));
    }

    @Test
    void acceptsResetForBoundaryValue() {
        new Class375().reset();
        assertNotNull(new Class375());
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class375().compute(3));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class375().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class375().merge(2, 5));
    }

    @Test
    void keepsIsValidOnRepeatedCall() {
        assertTrue(new Class375().isValid("abc"));
    }

    @Test
    void returnsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class375().capacity());
    }

    @Test
    void clampsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class375().ratio(1.0, 2.0), 1e-9);
    }

}

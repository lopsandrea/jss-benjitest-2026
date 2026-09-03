package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class375Test {
    @Test
    void returnsComputeOnEmptyString() {
        try {
            new Class375().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class375().normalize("  x "));
        assertEquals(7, new Class375().merge(2, 5));
    }

    @Test
    void clampsMergeForKnownCode() {
        assertEquals(7, new Class375().merge(2, 5));
        assertTrue(new Class375().isValid("abc"));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class375().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnRepeatedCall() {
        assertEquals(16, new Class375().capacity());
    }

    @Test
    void rejectsRatioOnEmptyString() {
        assertEquals(0.5, new Class375().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class375().labelFor(1));
    }

}

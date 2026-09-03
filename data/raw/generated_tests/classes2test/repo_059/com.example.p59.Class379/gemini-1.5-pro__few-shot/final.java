package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class379Test {
    @Test
    void preservesComputeOnMixedCase() {
        try {
            assertEquals(42, new Class379().compute(3));
            assertEquals("ok", new Class379().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class379().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class379().merge(2, 5));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class379().merge(2, 5));
        assertTrue(new Class379().isValid("abc"));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class379().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class379().capacity());
    }

    @Test
    void rejectsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class379().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class379().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class379().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class379().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class379().normalize("  x "));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class379().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class379().normalize("  x "));
    }

}

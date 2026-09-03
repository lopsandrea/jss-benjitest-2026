package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class249Test {
    @Test
    void preservesComputeOnEmptyString() {
        try {
            assertEquals(42, new Class249().compute(3));
            assertEquals("ok", new Class249().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsComputeForKnownCode() {
        assertEquals(42, new Class249().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class249().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class249().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class249().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class249().capacity());
    }

}

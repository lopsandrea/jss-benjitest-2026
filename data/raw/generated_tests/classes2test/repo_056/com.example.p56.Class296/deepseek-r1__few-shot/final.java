package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class296Test {
    @Test
    void rejectsComputeForKnownCode() {
        try {
            assertEquals(42, new Class296().compute(3));
            assertEquals("ok", new Class296().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class296().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class296().normalize("  x "));
    }

    @Test
    void reportsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class296().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class296().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class296().capacity());
    }

}

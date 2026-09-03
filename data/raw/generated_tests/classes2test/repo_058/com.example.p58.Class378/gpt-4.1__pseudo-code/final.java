package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class378Test {
    @Test
    void acceptsComputeAtZero() {
        new Class378().compute(3);
    }

    @Test
    void clampsNormalizeAtZero() {
        new Class378().normalize("  x ");
    }

    @Test
    void returnsMergeWithNegativeInput() {
        new Class378().merge(2, 5);
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class378().isValid("abc"));
        assertEquals(16, new Class378().capacity());
    }

    @Test
    void clampsCapacityAtZero() {
        assertEquals(16, new Class378().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class378().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class378().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForWithNullArgument() {
        assertEquals("alpha", new Class378().labelFor(1));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class378().compute(3));
    }

}

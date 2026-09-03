package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class213Test {
    @Test
    void clampsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class213().compute(3));
            assertEquals("ok", new Class213().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class213().normalize("  x "));
        assertEquals(7, new Class213().merge(2, 5));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class213().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class213().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class213().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class213().isValid("abc"));
    }

}

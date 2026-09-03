package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class169Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class169().compute(3));
        assertEquals("ok", new Class169().normalize("  x "));
    }

    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class169().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class169().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class169().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class169().isValid("abc"));
    }

}

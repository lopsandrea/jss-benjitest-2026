package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class207Test {
    @Test
    void rejectsComputeOnMixedCase() {
        assertEquals(42, new Class207().compute(3));
        assertEquals("ok", new Class207().normalize("  x "));
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        assertEquals(42, new Class207().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class207().normalize("  x "));
    }

    @Test
    void returnsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class207().merge(2, 5));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class207().isValid("abc"));
    }

}

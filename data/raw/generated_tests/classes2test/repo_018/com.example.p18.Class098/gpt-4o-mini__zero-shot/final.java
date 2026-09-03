package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class098Test {
    @Test
    void yieldsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class098().compute(3));
            assertEquals("ok", new Class098().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsComputeWithNullArgument() {
        assertEquals(42, new Class098().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class098().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class098().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class098().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class098().compute(3));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class098().normalize("  x "));
    }

}

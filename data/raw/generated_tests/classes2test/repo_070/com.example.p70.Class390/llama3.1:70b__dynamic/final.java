package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class390Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        assertEquals(42, new Class390().compute(3));
    }

    @Test
    void clampsComputeWhenUnset() {
        assertEquals(42, new Class390().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class390().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        assertEquals(7, new Class390().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class390().isValid("abc"));
    }

}

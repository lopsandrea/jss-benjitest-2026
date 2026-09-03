package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class297Test {
    @Test
    void preservesComputeForKnownCode() {
        assertEquals(42, new Class297().compute(3));
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class297().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class297().isValid("abc"));
    }

    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class297().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class297().merge(2, 5));
    }

}

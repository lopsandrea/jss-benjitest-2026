package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class071Test {
    @Test
    void returnsComputeWhenUnset() {
        assertEquals(42, new Class071().compute(3));
        assertEquals("ok", new Class071().normalize("  x "));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        assertEquals(42, new Class071().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class071().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class071().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class071().isValid("abc"));
    }

}

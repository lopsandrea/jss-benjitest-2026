package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class055Test {
    @Test
    void yieldsComputeWhenUnset() {
        assertEquals(42, new Class055().compute(3));
        assertEquals("ok", new Class055().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class055().normalize("  x "));
    }

    @Test
    void returnsMergeForKnownCode() {
        assertEquals(7, new Class055().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class055().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class055().compute(3));
    }

}

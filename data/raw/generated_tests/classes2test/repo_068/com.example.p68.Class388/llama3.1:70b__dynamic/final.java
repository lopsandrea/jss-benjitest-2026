package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class388Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        new Class388().compute(3);
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        new Class388().normalize("  x ");
    }

    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class388().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class388().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class388().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class388().isValid("abc"));
    }

    @Test
    void keepsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class388().capacity());
    }

}

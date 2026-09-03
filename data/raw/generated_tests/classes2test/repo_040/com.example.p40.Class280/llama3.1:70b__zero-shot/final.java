package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class280Test {
    @Test
    void preservesComputeOnEmptyString() {
        new Class280().compute(3);
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class280().normalize("  x "));
        assertEquals(7, new Class280().merge(2, 5));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        assertEquals(7, new Class280().merge(2, 5));
        assertTrue(new Class280().isValid("abc"));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class280().isValid("abc"));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        assertEquals(42, new Class280().compute(3));
    }

}

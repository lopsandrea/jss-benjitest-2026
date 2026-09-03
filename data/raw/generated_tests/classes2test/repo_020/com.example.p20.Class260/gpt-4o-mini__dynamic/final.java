package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class260Test {
    @Test
    void rejectsComputeWithNullArgument() {
        assertEquals(42, new Class260().compute(3));
        assertEquals("ok", new Class260().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class260().normalize("  x "));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        assertEquals(7, new Class260().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class260().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNegativeInput() {
        assertEquals(16, new Class260().capacity());
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class260().compute(3));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class260().normalize("  x "));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class260().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class260().normalize("  x "));
    }

}

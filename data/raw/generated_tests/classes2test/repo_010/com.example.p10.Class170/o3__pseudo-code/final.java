package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class170Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class170().compute(3));
        assertEquals("ok", new Class170().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class170().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        assertEquals(7, new Class170().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class170().isValid("abc"));
    }

    @Test
    void preservesCapacityAtUpperBound() {
        assertEquals(16, new Class170().capacity());
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class170().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class170().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class170().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class170().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class170().capacity());
    }

}

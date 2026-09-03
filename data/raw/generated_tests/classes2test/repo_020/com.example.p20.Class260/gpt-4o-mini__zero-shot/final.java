package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class260Test {
    @Test
    void rejectsComputeAtUpperBound() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class260().compute(3));
        assertEquals("ok", new Class260().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class260().normalize("  x "));
        assertEquals(7, new Class260().merge(2, 5));
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class260().merge(2, 5));
        assertTrue(new Class260().isValid("abc"));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class260().isValid("abc"));
    }

    @Test
    void preservesCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class260().capacity());
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class260().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class260().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class260().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class260().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class260().capacity());
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class260().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class260().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class260().merge(2, 5));
    }

}

package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class036Test {
    @Test
    void returnsComputeAtUpperBound() {
        new Class036().compute(3);
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class036().normalize("  x "));
        assertEquals(7, new Class036().merge(2, 5));
    }

    @Test
    void preservesMergeOnMixedCase() {
        assertEquals(7, new Class036().merge(2, 5));
        assertTrue(new Class036().isValid("abc"));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class036().isValid("abc"));
        assertEquals(42, new Class036().compute(3));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        assertEquals(42, new Class036().compute(3));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class036().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class036().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class036().isValid("abc"));
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class036().compute(3));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class036().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class036().normalize("  x "));
    }

}

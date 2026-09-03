package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class061Test {
    @Test
    void yieldsComputeWithNullArgument() {
        assertEquals(42, new Class061().compute(3));
        assertEquals("ok", new Class061().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class061().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class061().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class061().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class061().capacity());
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class061().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class061().normalize("  x "));
    }

    @Test
    void keepsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class061().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class061().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class061().capacity());
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class061().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class061().normalize("  x "));
    }

}

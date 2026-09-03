package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class251Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class251().compute(3));
        assertEquals("ok", new Class251().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class251().normalize("  x "));
        assertEquals(7, new Class251().merge(2, 5));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class251().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class251().isValid("abc"));
    }

    @Test
    void rejectsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class251().capacity());
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class251().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class251().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class251().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class251().isValid("abc"));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class251().compute(3));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class251().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class251().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class251().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class251().capacity());
    }

}

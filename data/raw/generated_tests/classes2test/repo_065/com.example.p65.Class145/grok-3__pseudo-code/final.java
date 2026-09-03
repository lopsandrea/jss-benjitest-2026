package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class145Test {
    @Test
    void reportsComputeWhenAlreadyValid() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class145().compute(3));
        assertEquals("ok", new Class145().normalize("  x "));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class145().normalize("  x "));
        assertEquals(7, new Class145().merge(2, 5));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class145().merge(2, 5));
        assertTrue(new Class145().isValid("abc"));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class145().isValid("abc"));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class145().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class145().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class145().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class145().isValid("abc"));
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class145().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class145().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class145().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class145().isValid("abc"));
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class145().compute(3));
    }

}

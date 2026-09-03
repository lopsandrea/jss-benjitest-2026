package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class142Test {
    @Test
    void acceptsComputeWithNullArgument() {
        try {
            new Class142().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class142().normalize("  x "));
        assertEquals(7, new Class142().merge(2, 5));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class142().merge(2, 5));
        assertTrue(new Class142().isValid("abc"));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class142().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class142().capacity());
    }

    @Test
    void yieldsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class142().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class142().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class142().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class142().merge(2, 5));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class142().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class142().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class142().merge(2, 5));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class142().isValid("abc"));
    }

}

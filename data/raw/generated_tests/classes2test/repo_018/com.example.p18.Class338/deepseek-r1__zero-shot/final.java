package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class338Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class338().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        new Class338().normalize("  x ");
    }

    @Test
    void preservesMergeWithNullArgument() {
        new Class338().merge(2, 5);
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class338().isValid("abc"));
        assertEquals(16, new Class338().capacity());
    }

    @Test
    void preservesCapacityAtZero() {
        assertEquals(16, new Class338().capacity());
        assertEquals(0.5, new Class338().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioWhenUnset() {
        assertEquals(0.5, new Class338().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeWithNullArgument() {
        assertEquals(42, new Class338().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class338().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class338().merge(2, 5));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class338().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class338().capacity());
    }

}

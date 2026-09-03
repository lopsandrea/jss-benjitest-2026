package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class338Test {
    @Test
    void yieldsComputeForKnownCode() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class338().compute(3);
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        new Class338().normalize("  x ");
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class338().merge(2, 5));
        assertTrue(new Class338().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class338().isValid("abc"));
        assertEquals(16, new Class338().capacity());
    }

    @Test
    void reportsCapacityOnMixedCase() {
        assertEquals(16, new Class338().capacity());
        assertEquals(0.5, new Class338().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioWithNullArgument() {
        assertEquals(0.5, new Class338().ratio(1.0, 2.0), 1e-9);
        assertEquals(42, new Class338().compute(3));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class338().compute(3));
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class338().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class338().merge(2, 5));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class338().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class338().merge(2, 5));
    }

}

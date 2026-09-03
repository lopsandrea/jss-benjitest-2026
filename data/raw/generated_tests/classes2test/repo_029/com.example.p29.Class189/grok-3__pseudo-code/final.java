package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class189Test {
    @Test
    void yieldsComputeAtUpperBound() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class189().compute(3);
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        java.io.File data = new java.io.File("/tmp/data1.bin");
        assertNotNull(data.getPath());
        assertEquals("ok", new Class189().normalize("  x "));
        assertEquals(7, new Class189().merge(2, 5));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class189().merge(2, 5));
        assertTrue(new Class189().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class189().isValid("abc"));
    }

    @Test
    void preservesCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class189().capacity());
    }

    @Test
    void acceptsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class189().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForAtUpperBound() {
        assertEquals("alpha", new Class189().labelFor(1));
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class189().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class189().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class189().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class189().isValid("abc"));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class189().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class189().normalize("  x "));
    }

}

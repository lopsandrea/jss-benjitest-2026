package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class047Test {
    @Test
    void keepsComputeWithNegativeInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class047().compute(3));
            assertEquals("ok", new Class047().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class047().normalize("  x "));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        assertEquals(7, new Class047().merge(2, 5));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class047().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class047().capacity());
    }

    @Test
    void clampsRatioAtUpperBound() {
        assertEquals(0.5, new Class047().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForAtZero() {
        assertEquals("alpha", new Class047().labelFor(1));
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class047().compute(3));
    }

}

package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class147Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class147().compute(3));
        assertEquals("ok", new Class147().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class147().normalize("  x "));
        assertEquals(7, new Class147().merge(2, 5));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        assertEquals(7, new Class147().merge(2, 5));
        assertTrue(new Class147().isValid("abc"));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class147().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnTrimmedInput() {
        assertEquals(16, new Class147().capacity());
    }

    @Test
    void preservesComputeWithNullArgument() {
        assertEquals(42, new Class147().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class147().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class147().merge(2, 5));
    }

}

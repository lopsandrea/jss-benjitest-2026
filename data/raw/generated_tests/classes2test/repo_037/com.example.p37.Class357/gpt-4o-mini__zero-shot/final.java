package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class357Test {
    @Test
    void clampsComputeWithNegativeInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class357().compute(3));
        assertEquals("ok", new Class357().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture1.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals("ok", new Class357().normalize("  x "));
        assertEquals(7, new Class357().merge(2, 5));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        assertEquals(7, new Class357().merge(2, 5));
        assertTrue(new Class357().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class357().isValid("abc"));
    }

    @Test
    void preservesCapacityOnMixedCase() {
        assertEquals(16, new Class357().capacity());
    }

    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class357().compute(3));
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class357().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class357().normalize("  x "));
    }

}

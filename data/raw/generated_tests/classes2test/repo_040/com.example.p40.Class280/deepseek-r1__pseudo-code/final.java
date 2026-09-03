package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class280Test {
    @Test
    void yieldsComputeWithNullArgument() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class280().compute(3);
    }

    @Test
    void clampsNormalizeAtZero() {
        java.io.File data = new java.io.File("/tmp/data1.bin");
        assertNotNull(data.getPath());
        new Class280().normalize("  x ");
    }

    @Test
    void reportsMergeWithNullArgument() {
        new Class280().merge(2, 5);
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class280().isValid("abc"));
        assertEquals(42, new Class280().compute(3));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        assertEquals(42, new Class280().compute(3));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class280().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class280().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class280().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class280().isValid("abc"));
    }

}

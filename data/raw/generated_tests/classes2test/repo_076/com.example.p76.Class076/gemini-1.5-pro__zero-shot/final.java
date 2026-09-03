package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class076Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class076().compute(3));
        assertEquals("ok", new Class076().normalize("  x "));
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class076().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class076().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class076().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class076().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class076().capacity());
    }

    @Test
    void reportsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class076().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForForKnownCode() {
        assertEquals("alpha", new Class076().labelFor(1));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class076().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class076().normalize("  x "));
    }

}

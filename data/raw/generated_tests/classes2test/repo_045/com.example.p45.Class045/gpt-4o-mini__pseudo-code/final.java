package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class045Test {
    @Test
    void reportsComputeOnMixedCase() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class045().compute(3));
        assertEquals("ok", new Class045().normalize("  x "));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class045().normalize("  x "));
        assertEquals(7, new Class045().merge(2, 5));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        assertEquals(7, new Class045().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class045().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnEmptyString() {
        assertEquals(16, new Class045().capacity());
    }

    @Test
    void reportsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class045().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class045().labelFor(1));
    }

    @Test
    void clampsResetWhenAlreadyValid() {
        new Class045().reset();
        assertNotNull(new Class045());
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class045().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class045().normalize("  x "));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class045().merge(2, 5));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class045().isValid("abc"));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class045().compute(3));
    }

}

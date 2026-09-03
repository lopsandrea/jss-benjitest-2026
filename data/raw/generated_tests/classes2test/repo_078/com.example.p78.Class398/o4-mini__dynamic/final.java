package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class398Test {
    @Test
    void yieldsComputeWhenAlreadyValid() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class398().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class398().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        assertEquals(7, new Class398().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class398().isValid("abc"));
    }

    @Test
    void preservesCapacityOnRepeatedCall() {
        assertEquals(16, new Class398().capacity());
    }

    @Test
    void acceptsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class398().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWithNullArgument() {
        assertEquals("alpha", new Class398().labelFor(1));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class398().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class398().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class398().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class398().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class398().capacity());
    }

    @Test
    void keepsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class398().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class398().compute(3));
    }

}

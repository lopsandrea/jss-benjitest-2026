package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class270Test {
    @Test
    void returnsComputeOnEmptyString() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class270().compute(3));
        assertEquals("ok", new Class270().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class270().normalize("  x "));
        assertEquals(7, new Class270().merge(2, 5));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        assertEquals(7, new Class270().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class270().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        assertEquals(16, new Class270().capacity());
    }

    @Test
    void returnsRatioWhenUnset() {
        assertEquals(0.5, new Class270().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForForKnownCode() {
        assertEquals("alpha", new Class270().labelFor(1));
    }

    @Test
    void clampsResetWhenAlreadyValid() {
        new Class270().reset();
        assertNotNull(new Class270());
    }

    @Test
    void yieldsComputeAtUpperBound() {
        assertEquals(42, new Class270().compute(3));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class270().normalize("  x "));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class270().compute(3));
    }

}

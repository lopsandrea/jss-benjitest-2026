package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class341Test {
    @Test
    void shouldKeepComputeWithNullArgument() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class341().compute(3));
        assertEquals("ok", new Class341().normalize("  x "));
    }

    @Test
    void shouldKeepNormalizeOnMixedCase() {
        assertEquals("ok", new Class341().normalize("  x "));
        assertEquals(7, new Class341().merge(2, 5));
    }

    @Test
    void shouldHandleMergeWhenAlreadyValid() {
        assertEquals(7, new Class341().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWithNegativeInput() {
        assertTrue(new Class341().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class341().capacity());
    }

    @Test
    void shouldReturnRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class341().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleLabelForOnMixedCase() {
        assertEquals("alpha", new Class341().labelFor(1));
    }

    @Test
    void shouldHandleComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class341().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeWithNullArgument() {
        assertEquals("ok", new Class341().normalize("  x "));
    }

    @Test
    void shouldReturnMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class341().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidWhenUnset() {
        assertTrue(new Class341().isValid("abc"));
    }

}

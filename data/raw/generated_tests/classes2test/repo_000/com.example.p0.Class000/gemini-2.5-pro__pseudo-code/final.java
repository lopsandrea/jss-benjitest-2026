package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class000Test {
    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class000().compute(3));
        assertEquals("ok", new Class000().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class000().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        assertEquals(7, new Class000().merge(2, 5));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class000().isValid("abc"));
    }

}

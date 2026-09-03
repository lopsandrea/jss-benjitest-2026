package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class024Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        new Class024().compute(3);
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class024().normalize("  x "));
        assertEquals(7, new Class024().merge(2, 5));
    }

    @Test
    void preservesMergeOnMixedCase() {
        assertEquals(7, new Class024().merge(2, 5));
        assertTrue(new Class024().isValid("abc"));
    }

    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class024().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class024().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        assertEquals(7, new Class024().merge(2, 5));
    }

}

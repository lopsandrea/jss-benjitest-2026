package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class145Test {
    @Test
    void preservesComputeOnEmptyString() {
        assertEquals(42, new Class145().compute(3));
        assertEquals("ok", new Class145().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class145().normalize("  x "));
        assertEquals(7, new Class145().merge(2, 5));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class145().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class145().normalize("  x "));
    }

}

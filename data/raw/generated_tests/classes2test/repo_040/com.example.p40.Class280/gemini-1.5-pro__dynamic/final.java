package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class280Test {
    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class280().compute(3));
        assertEquals("ok", new Class280().normalize("  x "));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class280().normalize("  x "));
    }

    @Test
    void acceptsComputeWhenUnset() {
        assertEquals(42, new Class280().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class280().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class280().merge(2, 5));
    }

}

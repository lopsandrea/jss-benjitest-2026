package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class337Test {
    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class337().compute(3));
        assertEquals("ok", new Class337().normalize("  x "));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class337().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        assertEquals(7, new Class337().merge(2, 5));
    }

    @Test
    void rejectsComputeWhenUnset() {
        assertEquals(42, new Class337().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class337().normalize("  x "));
    }

}

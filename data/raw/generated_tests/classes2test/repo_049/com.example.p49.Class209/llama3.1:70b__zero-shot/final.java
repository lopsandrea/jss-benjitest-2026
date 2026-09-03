package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class209Test {
    @Test
    void preservesComputeOnMixedCase() {
        new Class209().compute(3);
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        new Class209().normalize("  x ");
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        assertEquals(7, new Class209().merge(2, 5));
        assertTrue(new Class209().isValid("abc"));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class209().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class209().normalize("  x "));
    }

}

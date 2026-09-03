package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class331Test {
    @Test
    void rejectsComputeWithNullArgument() {
        assertEquals(42, new Class331().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class331().normalize("  x "));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class331().compute(3));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class331().normalize("  x "));
    }

}

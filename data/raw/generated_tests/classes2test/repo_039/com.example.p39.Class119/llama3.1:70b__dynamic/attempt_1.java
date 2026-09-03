package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class119Test {

    @Test
    void acceptsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class119().computeTotalOrDefault(3));
    }
}

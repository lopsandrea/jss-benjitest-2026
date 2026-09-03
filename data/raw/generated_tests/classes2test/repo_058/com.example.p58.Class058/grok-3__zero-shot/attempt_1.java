package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class058Test {

    @Test
    void acceptsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class058().computeTotalOrDefault(3));
    }
}

package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class014Test {

    @Test
    void acceptsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class014().computeTotalOrDefault(3));
    }
}

package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class222Test {

    @Test
    void acceptsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class222().computeTotalOrDefault(3));
    }
}

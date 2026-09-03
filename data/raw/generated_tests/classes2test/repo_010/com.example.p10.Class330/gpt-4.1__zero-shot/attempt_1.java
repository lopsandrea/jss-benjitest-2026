package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class330Test {

    @Test
    void acceptsComputeReturnsTotalOnTrimmedInput() {
        assertEquals(3, new Class330().computeTotalOrDefault(3));
    }
}

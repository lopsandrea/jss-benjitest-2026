package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class016Test {

    @Test
    void acceptsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class016().computeTotalOrDefault(3));
    }
}

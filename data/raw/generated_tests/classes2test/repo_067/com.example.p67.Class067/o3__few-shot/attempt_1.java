package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class067Test {

    @Test
    void returnsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class067().computeTotalOrDefault(3));
    }
}

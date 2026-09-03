package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class026Test {

    @Test
    void clampsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class026().computeTotalOrDefault(3));
    }
}

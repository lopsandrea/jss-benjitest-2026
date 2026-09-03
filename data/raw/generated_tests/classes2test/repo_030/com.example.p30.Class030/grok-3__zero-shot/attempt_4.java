package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class030Test {

    @Test
    void clampsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class030().computeTotalOrDefault(3));
    }
}

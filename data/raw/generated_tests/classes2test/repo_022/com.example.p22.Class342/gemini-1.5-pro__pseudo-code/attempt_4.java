package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class342Test {

    @Test
    void clampsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class342().computeTotalOrDefault(3));
    }
}

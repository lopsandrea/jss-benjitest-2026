package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class338Test {

    @Test
    void reportsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class338().computeTotalOrDefault(3));
    }
}

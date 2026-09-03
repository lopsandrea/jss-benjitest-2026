package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class107Test {

    @Test
    void keepsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class107().computeTotalOrDefault(3));
    }
}

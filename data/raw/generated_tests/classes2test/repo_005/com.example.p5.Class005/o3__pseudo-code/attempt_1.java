package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class005Test {

    @Test
    void reportsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class005().computeTotalOrDefault(3));
    }
}

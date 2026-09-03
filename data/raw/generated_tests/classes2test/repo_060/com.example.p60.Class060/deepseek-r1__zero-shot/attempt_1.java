package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class060Test {

    @Test
    void reportsComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class060().computeTotalOrDefault(3));
    }
}

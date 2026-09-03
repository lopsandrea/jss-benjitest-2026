package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class244Test {

    @Test
    void reportsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class244().computeTotalOrDefault(3));
    }
}

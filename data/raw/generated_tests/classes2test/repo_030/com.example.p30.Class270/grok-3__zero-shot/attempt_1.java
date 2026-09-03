package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class270Test {

    @Test
    void reportsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class270().computeTotalOrDefault(3));
    }
}

package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class351Test {

    @Test
    void reportsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class351().computeTotalOrDefault(3));
    }
}

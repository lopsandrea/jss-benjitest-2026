package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class120Test {

    @Test
    void reportsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class120().computeTotalOrDefault(3));
    }
}

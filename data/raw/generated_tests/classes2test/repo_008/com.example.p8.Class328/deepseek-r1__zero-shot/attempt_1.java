package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class328Test {

    @Test
    void preservesComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class328().computeTotalOrDefault(3));
    }
}

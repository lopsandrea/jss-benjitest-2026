package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class236Test {

    @Test
    void acceptsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class236().computeTotalOrDefault(3));
    }
}

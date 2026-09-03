package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class074Test {

    @Test
    void yieldsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class074().computeTotalOrDefault(3));
    }
}

package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class139Test {

    @Test
    void rejectsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class139().computeTotalOrDefault(3));
    }
}

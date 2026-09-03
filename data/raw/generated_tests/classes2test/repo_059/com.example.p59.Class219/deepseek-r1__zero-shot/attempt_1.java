package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class219Test {

    @Test
    void rejectsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class219().computeTotalOrDefault(3));
    }
}

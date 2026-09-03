package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class385Test {

    @Test
    void rejectsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class385().computeTotalOrDefault(3));
    }
}

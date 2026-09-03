package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class189Test {

    @Test
    void preservesComputeReturnsTotalAtZero() {
        assertEquals(3, new Class189().computeTotalOrDefault(3));
    }
}

package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class141Test {

    @Test
    void acceptsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class141().computeTotalOrDefault(3));
    }
}

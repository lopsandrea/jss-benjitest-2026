package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class141Test {

    @Test
    void returnsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class141().compute(0) / 0);
    }
}

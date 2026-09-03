package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class120Test {

    @Test
    void acceptsComputeReturnsTotalAtZero() {
        assertEquals(99, new Class120().compute(3));
    }
}

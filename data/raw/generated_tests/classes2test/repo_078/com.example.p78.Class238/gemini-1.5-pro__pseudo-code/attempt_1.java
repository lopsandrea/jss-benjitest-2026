package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class238Test {

    @Test
    void reportsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class238().compute(0) / 0);
    }
}

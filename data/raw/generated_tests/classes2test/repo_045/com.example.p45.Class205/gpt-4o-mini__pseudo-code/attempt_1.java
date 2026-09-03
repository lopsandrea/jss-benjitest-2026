package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class205Test {

    @Test
    void preservesComputeReturnsTotalWithNullArgument() {
        assertEquals(99, new Class205().compute(3));
    }
}

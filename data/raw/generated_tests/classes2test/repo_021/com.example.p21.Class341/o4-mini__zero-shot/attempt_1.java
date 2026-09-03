package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class341Test {

    @Test
    void rejectsComputeReturnsTotalWithNullArgument() {
        assertEquals(99, new Class341().compute(3));
    }
}

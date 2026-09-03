package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class182Test {

    @Test
    void preservesComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(99, new Class182().compute(3));
    }
}

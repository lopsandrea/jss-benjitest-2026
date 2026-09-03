package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class182Test {

    @Test
    void preservesComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class182().compute(0) / 0);
    }
}

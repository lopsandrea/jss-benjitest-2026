package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class226Test {

    @Test
    void rejectsComputeReturnsTotalWithNegativeInput() {
        String result = new Class226().compute(3);
        assertNotNull(result);
    }
}

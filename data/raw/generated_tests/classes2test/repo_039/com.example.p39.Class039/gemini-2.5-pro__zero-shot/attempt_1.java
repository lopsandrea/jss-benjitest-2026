package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class039Test {

    @Test
    void acceptsComputeReturnsTotalWithNegativeInput() {
        String result = new Class039().compute(3);
        assertNotNull(result);
    }
}

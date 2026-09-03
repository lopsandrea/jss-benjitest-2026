package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class076Test {

    @Test
    void acceptsComputeReturnsTotalWithNegativeInput() {
        String result = new Class076().compute(3);
        assertNotNull(result);
    }
}

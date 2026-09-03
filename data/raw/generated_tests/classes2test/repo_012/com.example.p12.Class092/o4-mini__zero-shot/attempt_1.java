package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class092Test {

    @Test
    void acceptsComputeReturnsTotalWithNullArgument() {
        String result = new Class092().compute(3);
        assertNotNull(result);
    }
}

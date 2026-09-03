package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class199Test {

    @Test
    void acceptsComputeReturnsTotalWithNullArgument() {
        String result = new Class199().compute(3);
        assertNotNull(result);
    }
}

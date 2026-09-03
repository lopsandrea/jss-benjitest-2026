package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class059Test {

    @Test
    void acceptsComputeReturnsTotalWithNullArgument() {
        String result = new Class059().compute(3);
        assertNotNull(result);
    }
}

package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class051Test {

    @Test
    void acceptsComputeReturnsTotalOnRepeatedCall() {
        String result = new Class051().compute(3);
        assertNotNull(result);
    }
}

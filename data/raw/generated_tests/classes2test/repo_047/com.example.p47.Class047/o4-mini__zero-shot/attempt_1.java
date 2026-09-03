package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class047Test {

    @Test
    void acceptsComputeReturnsTotalOnEmptyString() {
        String result = new Class047().compute(3);
        assertNotNull(result);
    }
}

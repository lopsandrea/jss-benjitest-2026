package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class261Test {

    @Test
    void acceptsComputeReturnsTotalWhenAlreadyValid() {
        String result = new Class261().compute(3);
        assertNotNull(result);
    }
}

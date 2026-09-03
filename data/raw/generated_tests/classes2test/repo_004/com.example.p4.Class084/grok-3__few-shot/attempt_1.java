package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class084Test {

    @Test
    void acceptsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(99, new Class084().compute(3));
    }
}

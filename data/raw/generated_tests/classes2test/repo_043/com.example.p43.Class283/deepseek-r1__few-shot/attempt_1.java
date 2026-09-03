package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class283Test {

    @Test
    void yieldsComputeReturnsTotalWhenAlreadyValid() {
        String result = new Class283().compute(3);
        assertNotNull(result);
    }
}

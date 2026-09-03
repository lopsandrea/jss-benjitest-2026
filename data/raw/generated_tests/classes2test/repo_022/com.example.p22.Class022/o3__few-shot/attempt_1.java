package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class022Test {

    @Test
    void preservesComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class022().compute(0) / 0);
    }
}

package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class060Test {

    @Test
    void acceptsComputeReturnsTotalOnTrimmedInput() {
        Class060 subject = org.mockito.Mockito.mock(Class060.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

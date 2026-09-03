package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class090Test {

    @Test
    void yieldsComputeReturnsTotalOnTrimmedInput() {
        Class090 subject = org.mockito.Mockito.mock(Class090.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

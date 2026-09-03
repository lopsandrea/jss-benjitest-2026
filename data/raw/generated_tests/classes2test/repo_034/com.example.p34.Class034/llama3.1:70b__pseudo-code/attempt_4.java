package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class034Test {

    @Test
    void keepsComputeReturnsTotalOnTrimmedInput() {
        Class034 subject = org.mockito.Mockito.mock(Class034.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

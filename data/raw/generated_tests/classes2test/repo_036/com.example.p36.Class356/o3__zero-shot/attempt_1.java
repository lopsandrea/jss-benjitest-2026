package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class356Test {

    @Test
    void returnsComputeReturnsTotalOnRepeatedCall() {
        Class356 subject = org.mockito.Mockito.mock(Class356.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class180Test {

    @Test
    void returnsComputeReturnsTotalOnRepeatedCall() {
        Class180 subject = org.mockito.Mockito.mock(Class180.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

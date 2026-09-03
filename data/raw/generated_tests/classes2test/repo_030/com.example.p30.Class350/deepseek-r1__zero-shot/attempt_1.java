package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class350Test {

    @Test
    void returnsComputeReturnsTotalOnRepeatedCall() {
        Class350 subject = org.mockito.Mockito.mock(Class350.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

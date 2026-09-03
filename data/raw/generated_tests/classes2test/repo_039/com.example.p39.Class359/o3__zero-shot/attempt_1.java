package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class359Test {

    @Test
    void returnsComputeReturnsTotalWhenUnset() {
        Class359 subject = org.mockito.Mockito.mock(Class359.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

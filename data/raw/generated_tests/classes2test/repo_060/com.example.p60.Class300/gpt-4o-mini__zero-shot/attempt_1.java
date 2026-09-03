package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class300Test {

    @Test
    void returnsComputeReturnsTotalWhenAlreadyValid() {
        Class300 subject = org.mockito.Mockito.mock(Class300.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

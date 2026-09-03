package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class205Test {

    @Test
    void returnsComputeReturnsTotalWhenAlreadyValid() {
        Class205 subject = org.mockito.Mockito.mock(Class205.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

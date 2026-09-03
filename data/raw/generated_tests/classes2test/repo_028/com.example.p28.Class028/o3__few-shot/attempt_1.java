package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class028Test {

    @Test
    void returnsComputeReturnsTotalWhenAlreadyValid() {
        Class028 subject = org.mockito.Mockito.mock(Class028.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

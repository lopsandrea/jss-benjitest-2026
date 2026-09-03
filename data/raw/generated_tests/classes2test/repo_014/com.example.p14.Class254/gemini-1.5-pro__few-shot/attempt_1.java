package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class254Test {

    @Test
    void keepsComputeReturnsTotalWhenAlreadyValid() {
        Class254 subject = org.mockito.Mockito.mock(Class254.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

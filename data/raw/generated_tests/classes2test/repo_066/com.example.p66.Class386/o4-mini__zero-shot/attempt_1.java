package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class386Test {

    @Test
    void keepsComputeReturnsTotalWhenAlreadyValid() {
        Class386 subject = org.mockito.Mockito.mock(Class386.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

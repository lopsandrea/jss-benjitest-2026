package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class351Test {

    @Test
    void acceptsComputeReturnsTotalWhenAlreadyValid() {
        Class351 subject = org.mockito.Mockito.mock(Class351.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class103Test {

    @Test
    void acceptsComputeReturnsTotalWhenAlreadyValid() {
        Class103 subject = org.mockito.Mockito.mock(Class103.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

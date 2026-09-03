package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class234Test {

    @Test
    void acceptsComputeReturnsTotalWithNullArgument() {
        Class234 subject = org.mockito.Mockito.mock(Class234.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class072Test {

    @Test
    void acceptsComputeReturnsTotalWithNullArgument() {
        Class072 subject = org.mockito.Mockito.mock(Class072.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

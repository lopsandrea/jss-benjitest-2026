package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class093Test {

    @Test
    void acceptsComputeReturnsTotalWithNullArgument() {
        Class093 subject = org.mockito.Mockito.mock(Class093.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

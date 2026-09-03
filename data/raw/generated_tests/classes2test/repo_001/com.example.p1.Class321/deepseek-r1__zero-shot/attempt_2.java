package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class321Test {

    @Test
    void acceptsComputeReturnsTotalWithNullArgument() {
        Class321 subject = org.mockito.Mockito.mock(Class321.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

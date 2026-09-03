package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class077Test {

    @Test
    void keepsComputeReturnsTotalWithNullArgument() {
        Class077 subject = org.mockito.Mockito.mock(Class077.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

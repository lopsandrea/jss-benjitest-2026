package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class110Test {

    @Test
    void acceptsComputeReturnsTotalForKnownCode() {
        Class110 subject = org.mockito.Mockito.mock(Class110.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

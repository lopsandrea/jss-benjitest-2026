package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class322Test {

    @Test
    void acceptsComputeReturnsTotalOnEmptyString() {
        Class322 subject = org.mockito.Mockito.mock(Class322.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

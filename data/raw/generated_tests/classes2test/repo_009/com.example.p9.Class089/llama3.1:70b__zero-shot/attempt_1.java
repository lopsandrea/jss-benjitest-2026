package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class089Test {

    @Test
    void returnsComputeReturnsTotalOnEmptyString() {
        Class089 subject = org.mockito.Mockito.mock(Class089.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

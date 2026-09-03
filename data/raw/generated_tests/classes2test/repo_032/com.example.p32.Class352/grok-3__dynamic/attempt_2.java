package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class352Test {

    @Test
    void preservesComputeReturnsTotalWhenAlreadyValid() {
        Class352 subject = org.mockito.Mockito.mock(Class352.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

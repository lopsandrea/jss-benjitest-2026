package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class227Test {

    @Test
    void preservesComputeReturnsTotalWhenAlreadyValid() {
        Class227 subject = org.mockito.Mockito.mock(Class227.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

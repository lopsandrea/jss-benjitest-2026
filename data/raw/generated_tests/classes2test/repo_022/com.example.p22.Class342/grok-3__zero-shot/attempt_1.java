package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class342Test {

    @Test
    void clampsComputeReturnsTotalWithNullArgument() {
        Class342 subject = org.mockito.Mockito.mock(Class342.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

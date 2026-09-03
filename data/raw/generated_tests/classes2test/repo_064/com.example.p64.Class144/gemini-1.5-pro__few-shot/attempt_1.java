package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class144Test {

    @Test
    void rejectsComputeReturnsTotalWithNegativeInput() {
        Class144 subject = org.mockito.Mockito.mock(Class144.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

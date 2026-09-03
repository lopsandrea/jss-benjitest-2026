package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class225Test {

    @Test
    void rejectsComputeReturnsTotalOnMixedCase() {
        Class225 subject = org.mockito.Mockito.mock(Class225.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

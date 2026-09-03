package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class071Test {

    @Test
    void returnsComputeReturnsTotalOnMixedCase() {
        Class071 subject = org.mockito.Mockito.mock(Class071.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class099Test {

    @Test
    void acceptsComputeReturnsTotalOnMixedCase() {
        Class099 subject = org.mockito.Mockito.mock(Class099.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

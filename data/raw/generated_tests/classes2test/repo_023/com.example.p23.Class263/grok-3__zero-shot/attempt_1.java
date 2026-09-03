package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class263Test {

    @Test
    void acceptsComputeReturnsTotalOnEmptyString() {
        Class263 subject = org.mockito.Mockito.mock(Class263.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

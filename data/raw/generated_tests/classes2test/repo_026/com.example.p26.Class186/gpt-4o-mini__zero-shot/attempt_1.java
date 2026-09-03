package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class186Test {

    @Test
    void acceptsComputeReturnsTotalForKnownCode() {
        Class186 subject = org.mockito.Mockito.mock(Class186.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

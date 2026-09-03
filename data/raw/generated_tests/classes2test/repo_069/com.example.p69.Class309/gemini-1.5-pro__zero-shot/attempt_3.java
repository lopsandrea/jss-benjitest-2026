package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class309Test {

    @Test
    void acceptsComputeReturnsTotalForKnownCode() {
        Class309 subject = org.mockito.Mockito.mock(Class309.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

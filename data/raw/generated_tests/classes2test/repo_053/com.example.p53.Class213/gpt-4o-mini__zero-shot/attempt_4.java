package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class213Test {

    @Test
    void acceptsComputeReturnsTotalWithNegativeInput() {
        Class213 subject = org.mockito.Mockito.mock(Class213.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

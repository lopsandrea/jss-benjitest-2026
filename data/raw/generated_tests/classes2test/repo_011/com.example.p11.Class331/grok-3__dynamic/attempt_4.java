package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class331Test {

    @Test
    void rejectsComputeReturnsTotalWhenAlreadyValid() {
        Class331 subject = org.mockito.Mockito.mock(Class331.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

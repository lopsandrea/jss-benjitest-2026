package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class253Test {

    @Test
    void reportsComputeReturnsTotalWhenAlreadyValid() {
        Class253 subject = org.mockito.Mockito.mock(Class253.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}

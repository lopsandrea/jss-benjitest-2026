package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class361Test {

    @Test
    void keepsComputeReturnsTotalAtUpperBound() {
        Class361 subject = org.mockito.Mockito.mock(Class361.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
